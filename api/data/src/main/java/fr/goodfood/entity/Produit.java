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
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix")
    private float prix;

    @ManyToMany(targetEntity = Categorie.class)
    @JoinTable(
            name = "categorise",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private List<Categorie> categories;

    @OneToMany(mappedBy = "produit")
    private List<Composition> compositions;

    //#region Générations

    public Produit() {
    }

    public Produit(Long id, String designation, float prix, List<Categorie> categories, List<Composition> compositions) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.categories = categories;
        this.compositions = compositions;
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

    public List<Categorie> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public List<Composition> getCompositions() {
        return this.compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
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

    public Produit categories(List<Categorie> categories) {
        setCategories(categories);
        return this;
    }

    public Produit compositions(List<Composition> compositions) {
        setCompositions(compositions);
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
        return Objects.equals(id, produit.id) && Objects.equals(designation, produit.designation) && prix == produit.prix && Objects.equals(categories, produit.categories) && Objects.equals(compositions, produit.compositions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, categories, compositions);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", categories='" + getCategories() + "'" +
            ", compositions='" + getCompositions() + "'" +
            "}";
    }

    //#endregion
}
