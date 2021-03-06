package fr.goodfood.dto.franchise;

import java.util.Objects;

import fr.goodfood.dto.adresse.SimpleAdresseDTO;

public class SimpleFranchiseDTO {
    private Long id;
    private String designation;
    private SimpleAdresseDTO adresse;

    // #region Générations

    public SimpleFranchiseDTO() {
    }

    public SimpleFranchiseDTO(Long id, String designation, SimpleAdresseDTO adresse) {
        this.id = id;
        this.designation = designation;
        this.adresse = adresse;
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

    public SimpleAdresseDTO getAdresse() {
        return this.adresse;
    }

    public void setAdresse(SimpleAdresseDTO adresse) {
        this.adresse = adresse;
    }

    public SimpleFranchiseDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleFranchiseDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public SimpleFranchiseDTO adresse(SimpleAdresseDTO adresse) {
        setAdresse(adresse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleFranchiseDTO)) {
            return false;
        }
        SimpleFranchiseDTO simpleFranchiseDTO = (SimpleFranchiseDTO) o;
        return Objects.equals(id, simpleFranchiseDTO.id) && Objects.equals(designation, simpleFranchiseDTO.designation)
                && Objects.equals(adresse, simpleFranchiseDTO.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, adresse);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", adresse='" + getAdresse()
                + "'" + "}";
    }

    // #endregion
}
