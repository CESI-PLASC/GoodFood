package fr.goodfood.dto.composition;

import fr.goodfood.entity.keys.CompositionKey;

public class SimpleCompositionDTO {
    private CompositionKey id;

    public CompositionKey getId(){
        return this.id;
    }

    public void setId(CompositionKey id){
        this.id = id;
    }

    private Double quantite;

    public Double getQuantite(){
        return this.quantite;
    }

    public void setQuantite(Double quantite){
        this.quantite = quantite;
    }
}
