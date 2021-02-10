package fr.goodfood.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.goodfood.entity.keys.CompositionKey;

@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)
@Entity
public class Composition{

    @EmbeddedId
    private CompositionKey id;

    @ManyToOne @MapsId("commandeId")
    private Commande commande;

    @ManyToOne @MapsId("formuleId")
    private Formule formule;

    @ManyToOne @MapsId("produitId")
    private Produit produit;

    private Integer quantite;

    public CompositionKey getId(){
        return this.id;
    }

    public Commande getCommande(){
        return this.commande;
    }

    public Formule getFormule(){
        return this.formule;
    }

    public Produit getProduit(){
        return this.produit;
    }

    public Integer getQuantite(){
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

    public void setProduit(Produit produit){
        this.produit = produit;
    }

    public void setQuantite(Integer quantite){
        this.quantite = quantite;
    }
}