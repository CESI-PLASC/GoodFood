package fr.goodfood.dto.formule;

import java.util.Objects;

public class SimpleFormuleDTO {

    private Long id;
    private String designation;
    private Float prix;
    private Boolean est_supprime;

    // #region Générations


    public SimpleFormuleDTO() {
    }

    public SimpleFormuleDTO(Long id, String designation, Float prix, Boolean est_supprime) {
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

    public Float getPrix() {
        return this.prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Boolean isEst_supprime() {
        return this.est_supprime;
    }

    public Boolean getEst_supprime() {
        return this.est_supprime;
    }

    public void setEst_supprime(Boolean est_supprime) {
        this.est_supprime = est_supprime;
    }

    public SimpleFormuleDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleFormuleDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public SimpleFormuleDTO prix(Float prix) {
        setPrix(prix);
        return this;
    }

    public SimpleFormuleDTO est_supprime(Boolean est_supprime) {
        setEst_supprime(est_supprime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleFormuleDTO)) {
            return false;
        }
        SimpleFormuleDTO simpleFormuleDTO = (SimpleFormuleDTO) o;
        return Objects.equals(id, simpleFormuleDTO.id) && Objects.equals(designation, simpleFormuleDTO.designation) && Objects.equals(prix, simpleFormuleDTO.prix) && Objects.equals(est_supprime, simpleFormuleDTO.est_supprime);
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
