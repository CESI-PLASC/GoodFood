package fr.goodfood.dto.requiert;

import java.util.Objects;

import fr.goodfood.entity.keys.RequiertKey;

public class RequiertSDTO {
    private RequiertKey id;
    private Long quantite;

    // #region Générations

    public RequiertSDTO() {
    }

    public RequiertSDTO(RequiertKey id, Long quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public RequiertKey getId() {
        return this.id;
    }

    public void setId(RequiertKey id) {
        this.id = id;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public RequiertSDTO id(RequiertKey id) {
        setId(id);
        return this;
    }

    public RequiertSDTO quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequiertSDTO)) {
            return false;
        }
        RequiertSDTO simpleRequiertDTO = (RequiertSDTO) o;
        return Objects.equals(id, simpleRequiertDTO.id) && Objects.equals(quantite, simpleRequiertDTO.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", quantite='" + getQuantite() + "'" + "}";
    }

    // #endregion
}
