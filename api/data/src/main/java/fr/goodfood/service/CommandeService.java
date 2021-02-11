package fr.goodfood.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.goodfood.repository.CommandeRepository;
import fr.goodfood.ressource.error.CommandeNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goodfood.dto.panier.CommandePanierDto;
import fr.goodfood.dto.panier.FormulePanierDto;
import fr.goodfood.dto.panier.ProduitPanierDto;
import fr.goodfood.entity.Commande;
import fr.goodfood.entity.Composition;
import fr.goodfood.entity.Formule;
import fr.goodfood.entity.Produit;

@Service
public class CommandeService {
    
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private ModelMapper modelMapper;

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
        return this.commandeRepository.findById(id).orElseThrow(() -> new CommandeNotFoundException(id));
    }

    public List<Commande> all(){
        return this.commandeRepository.findAll();
    }

    public void delete(Long id){
        this.commandeRepository.deleteById(id);
    }

    public CommandePanierDto panier(Long id){
        Commande commande = this.one(id);
        CommandePanierDto panier = this.modelMapper.map(commande, CommandePanierDto.class);

        List<Composition> compositions = commande.getCompositions();
        HashMap<Long, FormulePanierDto> formulesMap = new HashMap<Long, FormulePanierDto>();

        for(Composition composition: compositions){

            // Ajoute la formule si elle n'est pas déjà ajoutée à la commande
            Formule formule = composition.getFormule();
            FormulePanierDto formulePanier;
            if(!formulesMap.containsKey(formule.getId())){
                formulePanier = this.modelMapper.map(formule, FormulePanierDto.class);
                formulePanier.setPoduits(new ArrayList<ProduitPanierDto>());

                formulesMap.put(formule.getId(), formulePanier);
            } else {
                formulePanier = formulesMap.get(formule.getId());
            }

            // Ajoute le produit
            Produit produit = composition.getProduit();
            ProduitPanierDto produitPanier = this.modelMapper.map(produit, ProduitPanierDto.class);
            produitPanier.setQuantite(composition.getQuantite());

            formulePanier.addProduit(produitPanier);
        }

        panier.setFormules(new ArrayList<FormulePanierDto>(formulesMap.values()));

        return panier;
    }
}
