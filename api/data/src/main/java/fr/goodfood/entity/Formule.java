package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Formule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String designation;

    @Column
    private Float prix;

    @ManyToMany(targetEntity = Franchise.class)
    @JoinTable(
            name = "propose",
            joinColumns = @JoinColumn(name = "formule_id"),
            inverseJoinColumns = @JoinColumn(name = "franchise_id")
    )
    private List<Franchise> franchises;

    //#region Générations

    public Formule() {
    }

    public Formule(Long id, String designation, Float prix, List<Franchise> franchises) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.franchises = franchises;
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

    public List<Franchise> getFranchises() {
        return this.franchises;
    }

    public void setFranchises(List<Franchise> franchises) {
        this.franchises = franchises;
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

    public Formule franchises(List<Franchise> franchises) {
        setFranchises(franchises);
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
        return Objects.equals(id, formule.id) && Objects.equals(designation, formule.designation) && Objects.equals(prix, formule.prix) && Objects.equals(franchises, formule.franchises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, franchises);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", franchises='" + getFranchises() + "'" +
            "}";
    }


    // #endregion
}
