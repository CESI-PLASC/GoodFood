package fr.goodfood.dto.formule;

import java.util.Objects;

public class FormuleDTO {

    private Long id;
    private String designation;
    private Float prix;

    // #region Générations

    public FormuleDTO() {
    }

    public FormuleDTO(Long id, String designation, Float prix) {
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

    public Float getPrix() {
        return this.prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public FormuleDTO id(Long id) {
        setId(id);
        return this;
    }

    public FormuleDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public FormuleDTO prix(Float prix) {
        setPrix(prix);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormuleDTO)) {
            return false;
        }
        FormuleDTO formuleDto = (FormuleDTO) o;
        return Objects.equals(id, formuleDto.id) && Objects.equals(designation, formuleDto.designation)
                && Objects.equals(prix, formuleDto.prix);
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
