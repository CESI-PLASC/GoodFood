package fr.goodfood.entity.keys;

import java.io.Serializable;

public class CompositionKey implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long commandeId;
    private Long formuleId;
    private Long produitId;

    public Long getCommandeId(){
        return this.commandeId;
    }

    public Long getFormuleId(){
        return this.formuleId;
    }

    public Long getProduitId(){
        return this.produitId;
    }

    public void setCommandeId(Long commandeId){
        this.commandeId = commandeId;
    }

    public void setFormuleId(Long formuleId){
        this.formuleId = formuleId;
    }

    public void setProduitId(Long produitId){
        this.produitId = produitId;
    }
}
