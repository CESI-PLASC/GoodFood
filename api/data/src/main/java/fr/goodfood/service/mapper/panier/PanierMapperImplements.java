package fr.goodfood.service.mapper.panier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.goodfood.dto.panier.CommandePanierDto;
import fr.goodfood.dto.panier.FormulePanierDto;
import fr.goodfood.dto.panier.ProduitPanierDto;
import fr.goodfood.entity.Commande;
import fr.goodfood.entity.Composition;
import fr.goodfood.entity.Formule;
import fr.goodfood.entity.Produit;

public class PanierMapperImplements implements PanierMapper{
    
    @Autowired
    private ModelMapper modelMapper;

    public CommandePanierDto toDto(Commande commande){
        
        CommandePanierDto panier = this.modelMapper.map(commande, CommandePanierDto.class);
        Set<Composition> compositions = commande.getCompositions();
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
