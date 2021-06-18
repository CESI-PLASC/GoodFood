package fr.goodfood.dto.formule;

import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.requiert.RequiertDTO;

public class FormuleDTO {

    private Long id;
    private String designation;
    private Float prix;
    private List<RequiertDTO> structure;

    // #region Générations

    public FormuleDTO() {
    }

    public FormuleDTO(Long id, String designation, Float prix, List<RequiertDTO> structure) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.structure = structure;
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

    public List<RequiertDTO> getStructure() {
        return this.structure;
    }

    public void setStructure(List<RequiertDTO> structure) {
        this.structure = structure;
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

    public FormuleDTO structure(List<RequiertDTO> structure) {
        setStructure(structure);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormuleDTO)) {
            return false;
        }
        FormuleDTO formuleDTO = (FormuleDTO) o;
        return Objects.equals(id, formuleDTO.id) && Objects.equals(designation, formuleDTO.designation)
                && Objects.equals(prix, formuleDTO.prix) && Objects.equals(structure, formuleDTO.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, structure);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + ", structure='" + getStructure() + "'" + "}";
    }

    // #endregion
}
