package fr.goodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation")
    private String designation;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

    @ManyToMany(targetEntity = Franchise.class)
    @JoinTable(name = "fcategorie", joinColumns = @JoinColumn(name = "categorie_id"), inverseJoinColumns = @JoinColumn(name = "franchise_id"))
    private List<Franchise> franchises;

    @OneToMany(mappedBy = "categorie")
    private List<Requiert> requierts;

    // #region Générations

    public Categorie() {
    }

    public Categorie(Long id, String designation, List<Produit> produits, List<Franchise> franchises,
            List<Requiert> requierts) {
        this.id = id;
        this.designation = designation;
        this.produits = produits;
        this.franchises = franchises;
        this.requierts = requierts;
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

    public List<Produit> getProduits() {
        return this.produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<Franchise> getFranchises() {
        return this.franchises;
    }

    public void setFranchises(List<Franchise> franchises) {
        this.franchises = franchises;
    }

    public List<Requiert> getRequierts() {
        return this.requierts;
    }

    public void setRequierts(List<Requiert> requierts) {
        this.requierts = requierts;
    }

    public Categorie id(Long id) {
        setId(id);
        return this;
    }

    public Categorie designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Categorie produits(List<Produit> produits) {
        setProduits(produits);
        return this;
    }

    public Categorie franchises(List<Franchise> franchises) {
        setFranchises(franchises);
        return this;
    }

    public Categorie requierts(List<Requiert> requierts) {
        setRequierts(requierts);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Categorie)) {
            return false;
        }
        Categorie categorie = (Categorie) o;
        return Objects.equals(id, categorie.id) && Objects.equals(designation, categorie.designation)
                && Objects.equals(produits, categorie.produits) && Objects.equals(franchises, categorie.franchises)
                && Objects.equals(requierts, categorie.requierts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, produits, franchises, requierts);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", produits='"
                + getProduits() + "'" + ", franchises='" + getFranchises() + "'" + ", requierts='" + getRequierts()
                + "'" + "}";
    }

    // #endregion
}
