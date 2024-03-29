package fr.goodfood.dto.categorie;

import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.dto.produit.SimpleProduitDTO;

import java.util.List;
import java.util.Objects;

public class CategorieDTO {
    private Long id;
    private String designation;
    private List<SimpleProduitDTO> produits;
    private List<SimpleFranchiseDTO> franchises;

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
    public CategorieDTO setId(Long id) {
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
    public CategorieDTO setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Récupère : produits.
     *
     * @return produits.
     */
    public List<SimpleProduitDTO> getProduits() {
        return produits;
    }

    /**
     * Défini la nouvelle valeur de : produits.
     *
     * @param produits La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public CategorieDTO setProduits(List<SimpleProduitDTO> produits) {
        this.produits = produits;
        return this;
    }

    /**
     * Récupère : franchises.
     *
     * @return franchises.
     */
    public List<SimpleFranchiseDTO> getFranchises() {
        return franchises;
    }

    /**
     * Défini la nouvelle valeur de : franchises.
     *
     * @param franchises La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public CategorieDTO setFranchises(List<SimpleFranchiseDTO> franchises) {
        this.franchises = franchises;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieDTO that = (CategorieDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(designation, that.designation) && Objects.equals(produits, that.produits) && Objects.equals(franchises, that.franchises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, produits, franchises);
    }

    @Override
    public String toString() {
        return "CategorieDTO{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", produits=" + produits +
                ", franchises=" + franchises +
                '}';
    }
}
