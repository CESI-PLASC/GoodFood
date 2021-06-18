package fr.goodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix")
    private float prix;

    @ManyToOne
    private Categorie categorie;

    // #region Générations

    public Produit() {
    }

    public Produit(Long id, String designation, float prix, Categorie categorie) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.categorie = categorie;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return this.categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Produit id(Long id) {
        setId(id);
        return this;
    }

    public Produit designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Produit prix(float prix) {
        setPrix(prix);
        return this;
    }

    public Produit categorie(Categorie categorie) {
        setCategorie(categorie);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produit)) {
            return false;
        }
        Produit produit = (Produit) o;
        return Objects.equals(id, produit.id) && Objects.equals(designation, produit.designation)
                && prix == produit.prix && Objects.equals(categorie, produit.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, categorie);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + ", categorie='" + getCategorie() + "'" + "}";
    }

    // #endregion
}
