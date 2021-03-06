package fr.goodfood.dto.produit;

import fr.goodfood.dto.categorie.SimpleCategorieDTO;

import java.util.List;
import java.util.Objects;

public class ProduitDTO {

    private Long id;
    private String designation;
    private float prix;
    private List<SimpleCategorieDTO> categories;

    // #region Générations

    public ProduitDTO() {
    }

    public ProduitDTO(Long id, String designation, float prix, List<SimpleCategorieDTO> categories) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.categories = categories;
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

    public List<SimpleCategorieDTO> getCategories() {
        return this.categories;
    }

    public void setCategories(List<SimpleCategorieDTO> categories) {
        this.categories = categories;
    }

    public ProduitDTO id(Long id) {
        setId(id);
        return this;
    }

    public ProduitDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public ProduitDTO prix(float prix) {
        setPrix(prix);
        return this;
    }

    public ProduitDTO categories(List<SimpleCategorieDTO> categories) {
        setCategories(categories);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProduitDTO)) {
            return false;
        }
        ProduitDTO produitDTO = (ProduitDTO) o;
        return Objects.equals(id, produitDTO.id) && Objects.equals(designation, produitDTO.designation)
                && prix == produitDTO.prix && Objects.equals(categories, produitDTO.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, categories);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + ", categories='" + getCategories() + "'" + "}";
    }

    // #endregion
}
