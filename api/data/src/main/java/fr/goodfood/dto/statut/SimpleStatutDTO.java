package fr.goodfood.dto.statut;

import java.util.Objects;

public class SimpleStatutDTO {

    private Long id;
    private String designation;

    // #region Générations

    public SimpleStatutDTO() {
    }

    public SimpleStatutDTO(Long id, String designation) {
        this.id = id;
        this.designation = designation;
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

    public SimpleStatutDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleStatutDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleStatutDTO)) {
            return false;
        }
        SimpleStatutDTO simpleStatutDTO = (SimpleStatutDTO) o;
        return Objects.equals(id, simpleStatutDTO.id) && Objects.equals(designation, simpleStatutDTO.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + "}";
    }

    // #endregion
}
