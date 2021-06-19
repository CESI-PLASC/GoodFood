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

    @Column(name = "est_supprime", nullable = false)
    private Boolean est_supprime = false;

    @ManyToOne
    private Categorie categorie;

    // #region Générations


    public Produit() {
    }

    public Produit(Long id, String designation, float prix, Boolean est_supprime, Categorie categorie) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.est_supprime = est_supprime;
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

    public Boolean isEst_supprime() {
        return this.est_supprime;
    }

    public Boolean getEst_supprime() {
        return this.est_supprime;
    }

    public void setEst_supprime(Boolean est_supprime) {
        this.est_supprime = est_supprime;
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

    public Produit est_supprime(Boolean est_supprime) {
        setEst_supprime(est_supprime);
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
        return Objects.equals(id, produit.id) && Objects.equals(designation, produit.designation) && prix == produit.prix && Objects.equals(est_supprime, produit.est_supprime) && Objects.equals(categorie, produit.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, est_supprime, categorie);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", est_supprime='" + isEst_supprime() + "'" +
            ", categorie='" + getCategorie() + "'" +
            "}";
    }


    // #endregion
}
