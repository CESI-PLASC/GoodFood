package fr.goodfood.dto.franchise;

import fr.goodfood.dto.categorie.SimpleCategorieDTO;

import java.util.List;
import java.util.Objects;

public class FranchiseDTO {
    private Long id;
    private String designation;
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
    public FranchiseDTO setId(Long id) {
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
    public FranchiseDTO setDesignation(String designation) {
        this.designation = designation;
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
    public FranchiseDTO setCategories(List<SimpleCategorieDTO> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FranchiseDTO that = (FranchiseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(designation, that.designation) && Objects.equals(categories, that.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, categories);
    }

    @Override
    public String toString() {
        return "FranchiseDTO{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", categories=" + categories +
                '}';
    }
}
