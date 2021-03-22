package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String designation;

    @Column
    private Float prix;

    // #region Générations

    public Formule() {
    }

    public Formule(Long id, String designation, Float prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
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

    public Float getPrix() {
        return this.prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Formule id(Long id) {
        setId(id);
        return this;
    }

    public Formule designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Formule prix(Float prix) {
        setPrix(prix);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Formule)) {
            return false;
        }
        Formule formule = (Formule) o;
        return Objects.equals(id, formule.id) && Objects.equals(designation, formule.designation)
                && Objects.equals(prix, formule.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + "}";
    }

    // #endregion
}
