package fr.goodfood.dto.produit;

import fr.goodfood.dto.categorie.SimpleCategorieDTO;

import java.util.Objects;

public class ProduitDTO {

    private Long id;
    private String designation;
    private float prix;
    private SimpleCategorieDTO categorie;
    private boolean est_supprime;

    // #region Générations

    public ProduitDTO() {
    }

    public ProduitDTO(Long id, String designation, float prix, SimpleCategorieDTO categorie, boolean est_supprime) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.categorie = categorie;
        this.est_supprime = est_supprime;
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

    public SimpleCategorieDTO getCategorie() {
        return this.categorie;
    }

    public void setCategorie(SimpleCategorieDTO categorie) {
        this.categorie = categorie;
    }

    public boolean isEst_supprime() {
        return this.est_supprime;
    }

    public boolean getEst_supprime() {
        return this.est_supprime;
    }

    public void setEst_supprime(boolean est_supprime) {
        this.est_supprime = est_supprime;
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

    public ProduitDTO categorie(SimpleCategorieDTO categorie) {
        setCategorie(categorie);
        return this;
    }

    public ProduitDTO est_supprime(boolean est_supprime) {
        setEst_supprime(est_supprime);
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
        return Objects.equals(id, produitDTO.id) && Objects.equals(designation, produitDTO.designation) && prix == produitDTO.prix && Objects.equals(categorie, produitDTO.categorie) && est_supprime == produitDTO.est_supprime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, categorie, est_supprime);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", categorie='" + getCategorie() + "'" +
            ", est_supprime='" + isEst_supprime() + "'" +
            "}";
    }

   
    // #endregion
}
