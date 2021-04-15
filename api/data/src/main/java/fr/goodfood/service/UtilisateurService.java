package fr.goodfood.service;

import java.util.HashMap;
import java.util.List;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Utilisateur;
import fr.goodfood.repository.UtilisateurRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private Environment env;

    @Autowired
    public void setPaiementService() {
    }

    public Utilisateur create(Utilisateur utilisateur) throws StripeException {
        Stripe.apiKey = env.getProperty("stripe_secret_key");

        Customer client = Customer.create(new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("email", utilisateur.getEmail());
                put("name", String.format("%s %s", utilisateur.getNom(), utilisateur.getPrenom()));
                put("phone", utilisateur.getTelephoneFixe());
                put("description", String.format("%s %s", utilisateur.getNom(), utilisateur.getPrenom()));
            }
        });

        utilisateur.stripe(client.getId());

        return this.utilisateurRepository.save(utilisateur);
    }

    public Utilisateur update(Utilisateur utilisateur) throws StripeException {
        if (utilisateur != null && utilisateur.getId() != null) {
            utilisateur = this.utilisateurRepository.save(utilisateur);
        } else {
            utilisateur = this.create(utilisateur);
        }

        return utilisateur;
    }

    public Utilisateur one(Long id) {
        return this.utilisateurRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Utilisateur> all() {
        return this.utilisateurRepository.findAll();
    }

    public void delete(Long id) {
        this.utilisateurRepository.deleteById(id);
    }
}
