package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.goodfood.entity.keys.CompositionKey;

@Entity
public class Composition {

    @EmbeddedId
    private CompositionKey id;

    @ManyToOne
    @MapsId("commandeId")
    private Commande commande;

    @ManyToOne
    @MapsId("formuleId")
    private Formule formule;

    @ManyToOne
    @MapsId("produitId")
    private Produit produit;

    @Column
    private Integer quantite;

    // #region Générations

    public Composition() {
    }

    public Composition(CompositionKey id, Commande commande, Formule formule, Produit produit, Integer quantite) {
        this.id = id;
        this.commande = commande;
        this.formule = formule;
        this.produit = produit;
        this.quantite = quantite;
    }

    public CompositionKey getId() {
        return this.id;
    }

    public void setId(CompositionKey id) {
        this.id = id;
    }

    public Commande getCommande() {
        return this.commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Formule getFormule() {
        return this.formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Produit getProduit() {
        return this.produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Integer getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Composition id(CompositionKey id) {
        setId(id);
        return this;
    }

    public Composition commande(Commande commande) {
        setCommande(commande);
        return this;
    }

    public Composition formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public Composition produit(Produit produit) {
        setProduit(produit);
        return this;
    }

    public Composition quantite(Integer quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Composition)) {
            return false;
        }
        Composition composition = (Composition) o;
        return Objects.equals(id, composition.id) && Objects.equals(commande, composition.commande)
                && Objects.equals(formule, composition.formule) && Objects.equals(produit, composition.produit)
                && Objects.equals(quantite, composition.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commande, formule, produit, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", commande='" + getCommande() + "'" + ", formule='" + getFormule() + "'"
                + ", produit='" + getProduit() + "'" + ", quantite='" + getQuantite() + "'" + "}";
    }

    // #endregion
}
