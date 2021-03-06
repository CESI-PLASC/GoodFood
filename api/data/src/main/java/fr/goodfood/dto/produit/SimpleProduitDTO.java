package fr.goodfood.dto.produit;

import java.util.Objects;

public class SimpleProduitDTO {

    private Long id;
    private String designation;
    private float prix;

    // #region Générations

    public SimpleProduitDTO() {
    }

    public SimpleProduitDTO(Long id, String designation, float prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleProduitDTO)) {
            return false;
        }
        SimpleProduitDTO simpleProduitDTO = (SimpleProduitDTO) o;
        return Objects.equals(id, simpleProduitDTO.id) && Objects.equals(designation, simpleProduitDTO.designation)
                && prix == simpleProduitDTO.prix;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + "}";
    }

    // #endregion
}
