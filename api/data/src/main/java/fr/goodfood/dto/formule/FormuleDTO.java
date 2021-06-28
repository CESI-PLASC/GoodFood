package fr.goodfood.dto.formule;

import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.requiert.RequiertDTO;

public class FormuleDTO {

    private Long id;
    private String designation;
    private Float prix;
    private List<RequiertDTO> structure;
    private Boolean est_supprime;

    // #region Générations


    public FormuleDTO() {
    }

    public FormuleDTO(Long id, String designation, Float prix, List<RequiertDTO> structure, Boolean est_supprime) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.structure = structure;
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

    public List<RequiertDTO> getStructure() {
        return this.structure;
    }

    public void setStructure(List<RequiertDTO> structure) {
        this.structure = structure;
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

    public FormuleDTO est_supprime(Boolean est_supprime) {
        setEst_supprime(est_supprime);
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
        return Objects.equals(id, formuleDTO.id) && Objects.equals(designation, formuleDTO.designation) && Objects.equals(prix, formuleDTO.prix) && Objects.equals(structure, formuleDTO.structure) && Objects.equals(est_supprime, formuleDTO.est_supprime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, structure, est_supprime);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", prix='" + getPrix() + "'" +
            ", structure='" + getStructure() + "'" +
            ", est_supprime='" + isEst_supprime() + "'" +
            "}";
    }
    
    // #endregion
}
