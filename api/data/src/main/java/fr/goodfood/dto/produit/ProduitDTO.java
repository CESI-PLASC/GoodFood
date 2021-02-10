package fr.goodfood.dto.produit;

import fr.goodfood.dto.categorie.SimpleCategorieDTO;

import java.util.List;
import java.util.Objects;

public class ProduitDTO {

    private Long id;
    private String designation;
    private float prix;
    private List<SimpleCategorieDTO> categories;

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
    public ProduitDTO setId(Long id) {
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
    public ProduitDTO setDesignation(String designation) {
        this.designation = designation;
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
    public ProduitDTO setPrix(float prix) {
        this.prix = prix;
        return this;
    }

    /**
     * Récupère : categories.
     *
     * @return categories.
     */
    public List<SimpleCategorieDTO> getCategories() {
        return categories;
    }

    /**
     * Défini la nouvelle valeur de : categories.
     *
     * @param categories La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public ProduitDTO setCategories(List<SimpleCategorieDTO> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduitDTO that = (ProduitDTO) o;
        return Float.compare(that.prix, prix) == 0 && Objects.equals(id, that.id) && Objects.equals(designation, that.designation) && Objects.equals(categories, that.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, categories);
    }
}
