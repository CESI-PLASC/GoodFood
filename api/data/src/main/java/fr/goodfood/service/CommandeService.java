package fr.goodfood.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import fr.goodfood.repository.CommandeRepository;
import fr.goodfood.ressource.error.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.entity.Commande;

@Service
@Transactional
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @PersistenceContext
    private EntityManager em;

    public Commande create(Commande commande) {
        commande = this.commandeRepository.save(commande);
        this.em.refresh(commande);
        return commande;
    }

    public Commande update(Commande commande) {
        if (commande != null && commande.getId() != null) {
            commande = this.commandeRepository.save(commande);
        } else {
            commande = this.create(commande);
        }

        return commande;
    }

    public Commande one(Long id) {
        return this.commandeRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    public List<Commande> all() {
        return this.commandeRepository.findAll();
    }

    public void delete(Long id) {
        this.commandeRepository.deleteById(id);
    }

    public Double getPrice(Long id) {
        Double price = this.commandeRepository.getPrice(id);
        return price == null ? 0 : price;
    }
}
