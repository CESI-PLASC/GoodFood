package fr.goodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    @Column(name = "id")
    private Long id;

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
    public Produit setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Récupère : prix.
     *
     * @return prix.
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Défini la nouvelle valeur de : prix.
     *
     * @param prix La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public Produit setPrix(float prix) {
        this.prix = prix;
        return this;
    }

    /**
     * Récupère : categories.
     *
     * @return categories.
     */
    public List<Categorie> getCategorieList() {
        return categories;
    }

    /**
     * Défini la nouvelle valeur de : categories.
     *
     * @param categories La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public Produit setCategorieList(List<Categorie> categories) {
        this.categories = categories;
        return this;
    }

    public List<Composition> getCompositions(){
        return this.compositions;
    }

    public Produit setCompositions(List<Composition> compositions){
        this.compositions = compositions;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Float.compare(produit.prix, prix) == 0 && Objects.equals(id, produit.id) && Objects.equals(categories, produit.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prix, categories);
    }
}
