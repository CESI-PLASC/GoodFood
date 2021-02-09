package fr.mycompany.goodfood.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.mycompany.goodfood.entity.keys.CompositionKey;

@Entity
public class Composition{

    private @EmbeddedId CompositionKey id;
    private @ManyToOne @MapsId("commandeId") Commande commande;
    private @ManyToOne @MapsId("formuleId") Formule formule;
    private Double quantite;

    public CompositionKey getId(){
        return this.id;
    }

    public Commande getCommande(){
        return this.commande;
    }

    public Formule getFormule(){
        return this.formule;
    }

    public Double getQuantite(){
        return this.quantite;
    }

    public void setId(CompositionKey id){
        this.id = id;
    }

    public void setCommande(Commande commande){
        this.commande = commande;
    }

    public void setFormule(Formule formule){
        this.formule = formule;
    }

    public void setQuantite(Double quantite){
        this.quantite = quantite;
    }
}