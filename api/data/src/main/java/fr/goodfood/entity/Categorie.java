package fr.goodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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

    @ManyToMany(targetEntity = Produit.class)
    @JoinTable(
            name = "categorise",
            joinColumns = @JoinColumn(name = "categorie_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private List<Produit> produits;

    @ManyToMany(targetEntity = Franchise.class)
    @JoinTable(
            name = "fcategorie",
            joinColumns = @JoinColumn(name = "categorie_id"),
            inverseJoinColumns = @JoinColumn(name = "franchise_id")
    )
    private List<Franchise> franchises;

    /**
     * Récupère : id.
     *
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Défini la nouvelle valeur de : id.
     *
     * @param id La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public Categorie setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Récupère : designation.
     *
     * @return designation.
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Défini la nouvelle valeur de : designation.
     *
     * @param designation La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public Categorie setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Récupère : produits.
     *
     * @return produits.
     */
    public List<Produit> getProduits() {
        return produits;
    }

    /**
     * Défini la nouvelle valeur de : produits.
     *
     * @param produits La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public Categorie setProduits(List<Produit> produits) {
        this.produits = produits;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(id, categorie.id) && Objects.equals(designation, categorie.designation) && Objects.equals(produits, categorie.produits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, produits);
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", produits=" + produits +
                ", franchises=" + franchises +
                '}';
    }
}
