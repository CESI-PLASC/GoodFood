package fr.goodfood.dto.formule;

import java.util.List;

import fr.goodfood.dto.produit.ProduitPanierDto;

public class FormulePanierDto extends FormuleBase {
    
    private List<ProduitPanierDto> produits;

    public List<ProduitPanierDto> getProduits(){
        return this.produits;
    }

    public FormulePanierDto setPoduits(List<ProduitPanierDto> produits){
        this.produits = produits;
        return this;
    }

    public FormulePanierDto addProduit(ProduitPanierDto produit){
        this.produits.add(produit);
        return this;
    }
}
