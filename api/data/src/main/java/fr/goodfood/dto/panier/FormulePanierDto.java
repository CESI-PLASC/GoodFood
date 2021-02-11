package fr.goodfood.dto.panier;

import java.util.List;

import fr.goodfood.dto.formule.FormuleBase;

public class FormulePanierDto extends FormuleBase {
    
    private Long id;
    private List<ProduitPanierDto> produits;

    public Long getId(){
        return this.id;
    }

    public FormulePanierDto setId(Long id){
        this.id = id;
        return this;
    }

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
