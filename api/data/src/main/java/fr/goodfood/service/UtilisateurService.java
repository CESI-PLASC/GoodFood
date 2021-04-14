package fr.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Utilisateur;
import fr.goodfood.repository.UtilisateurRepository;
import fr.goodfood.ressource.error.NotFoundException;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    private PaiementService paiementService;
    @Autowired
    public void setPaiementService(PaiementService paiementService){
        this.paiementService = paiementService;
    }

    public Utilisateur create(Utilisateur utilisateur) {
        
        utilisateur.codePaiement(this.paiementService.genererCodePaiement(utilisateur));
        System.out.println(utilisateur.getCodePaiement());

        return this.utilisateurRepository.save(utilisateur);
    }

    public Utilisateur update(Utilisateur utilisateur) {
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
