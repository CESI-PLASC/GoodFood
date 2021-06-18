package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;

import fr.goodfood.entity.keys.RequiertKey;

@Entity
public class Requiert {

    @EmbeddedId
    private RequiertKey id;

    @ManyToOne
    @MapsId("categorieId")
    private Categorie categorie;

    @JsonBackReference
    @ManyToOne
    @MapsId("formuleId")
    private Formule formule;

    @Column(nullable = false)
    private Long quantite;

    // #region Générations

    public Requiert() {
    }

    public Requiert(RequiertKey id, Categorie categorie, Formule formule, Long quantite) {
        this.id = id;
        this.categorie = categorie;
        this.formule = formule;
        this.quantite = quantite;
    }

    public RequiertKey getId() {
        return this.id;
    }

    public void setId(RequiertKey id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        return this.categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Formule getFormule() {
        return this.formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Requiert id(RequiertKey id) {
        setId(id);
        return this;
    }

    public Requiert categorie(Categorie categorie) {
        setCategorie(categorie);
        return this;
    }

    public Requiert formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public Requiert quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Requiert)) {
            return false;
        }
        Requiert requiert = (Requiert) o;
        return Objects.equals(id, requiert.id) && Objects.equals(categorie, requiert.categorie)
                && Objects.equals(formule, requiert.formule) && Objects.equals(quantite, requiert.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categorie, formule, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", categorie='" + getCategorie() + "'" + ", formule='" + getFormule()
                + "'" + ", quantite='" + getQuantite() + "'" + "}";
    }

    // #endregion
}
