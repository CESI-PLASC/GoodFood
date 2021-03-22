package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;

import fr.goodfood.entity.keys.ContientKey;

@Entity
public class Contient {

    @EmbeddedId
    private ContientKey id;

    @JsonBackReference
    @ManyToOne
    @MapsId("contenuId")
    private Contenu contenu;

    @ManyToOne
    @MapsId("produitId")
    private Produit produit;

    @Column(nullable = false)
    private Long quantite;

    // #region Générations

    public Contient() {
    }

    public Contient(ContientKey id, Contenu contenu, Produit produit, Long quantite) {
        this.id = id;
        this.contenu = contenu;
        this.produit = produit;
        this.quantite = quantite;
    }

    public ContientKey getId() {
        return this.id;
    }

    public void setId(ContientKey id) {
        this.id = id;
    }

    public Contenu getContenu() {
        return this.contenu;
    }

    public void setContenu(Contenu contenu) {
        this.contenu = contenu;
    }

    public Produit getProduit() {
        return this.produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Contient id(ContientKey id) {
        setId(id);
        return this;
    }

    public Contient contenu(Contenu contenu) {
        setContenu(contenu);
        return this;
    }

    public Contient produit(Produit produit) {
        setProduit(produit);
        return this;
    }

    public Contient quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contient)) {
            return false;
        }
        Contient contient = (Contient) o;
        return Objects.equals(id, contient.id) && Objects.equals(contenu, contient.contenu)
                && Objects.equals(produit, contient.produit) && Objects.equals(quantite, contient.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contenu, produit, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", contenu='" + getContenu() + "'" + ", produit='" + getProduit() + "'"
                + ", quantite='" + getQuantite() + "'" + "}";
    }

    // #endregion
}
