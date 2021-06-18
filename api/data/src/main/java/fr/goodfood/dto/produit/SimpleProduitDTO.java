package fr.goodfood.dto.produit;

import java.util.Objects;

public class SimpleProduitDTO {

    private Long id;
    private String designation;
    private float prix;
    private boolean est_supprime;

    // #region Générations


    public SimpleProduitDTO() {
    }

    public SimpleProduitDTO(Long id, String designation, float prix, boolean est_supprime) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
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

    public boolean isEst_supprime() {
        return this.est_supprime;
    }

    public boolean getEst_supprime() {
        return this.est_supprime;
    }

    public void setEst_supprime(boolean est_supprime) {
        this.est_supprime = est_supprime;
    }

    public SimpleProduitDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleProduitDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public SimpleProduitDTO prix(float prix) {
        setPrix(prix);
        return this;
    }

    public SimpleProduitDTO est_supprime(boolean est_supprime) {
        setEst_supprime(est_supprime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleProduitDTO)) {
            return false;
        }
        SimpleProduitDTO simpleProduitDTO = (SimpleProduitDTO) o;
        return Objects.equals(id, simpleProduitDTO.id) && Objects.equals(designation, simpleProduitDTO.designation) && prix == simpleProduitDTO.prix && est_supprime == simpleProduitDTO.est_supprime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, est_supprime);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", est_supprime='" + isEst_supprime() + "'" +
            "}";
    }


    // #endregion
}
