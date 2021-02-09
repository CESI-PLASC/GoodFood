package fr.mycompany.goodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mycompany.goodfood.entity.Commande;
import fr.mycompany.goodfood.ressource.error.NotFoundException;
import fr.mycompany.goodfood.repository.CommandeRepository;

@Service
public class CommandeService {
    
    @Autowired
    private CommandeRepository commandeRepository;

    public Commande create(Commande newCommande){
        return this.commandeRepository.save(newCommande);
    }

    public Commande update(Commande commande){
        if(commande != null && commande.getId() != null){
            commande = this.commandeRepository.save(commande);
        } else {
            commande = this.create(commande);
        }

        return commande;
    }

    public Commande one(Long id){
        return this.commandeRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }

    public List<Commande> all(){
        return this.commandeRepository.findAll();
    }

    public void delete(Long id){
        this.commandeRepository.deleteById(id);
    }
}
