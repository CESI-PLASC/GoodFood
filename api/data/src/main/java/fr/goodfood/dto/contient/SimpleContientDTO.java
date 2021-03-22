package fr.goodfood.dto.contient;

import java.util.Objects;

import fr.goodfood.entity.keys.ContientKey;

public class SimpleContientDTO {
    private ContientKey id;
    private Long quantite;

    //#region Générations

    public SimpleContientDTO() {
    }

    public SimpleContientDTO(ContientKey id, Long quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public ContientKey getId() {
        return this.id;
    }

    public void setId(ContientKey id) {
        this.id = id;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public SimpleContientDTO id(ContientKey id) {
        setId(id);
        return this;
    }

    public SimpleContientDTO quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleContientDTO)) {
            return false;
        }
        SimpleContientDTO simpleContientDTO = (SimpleContientDTO) o;
        return Objects.equals(id, simpleContientDTO.id) && Objects.equals(quantite, simpleContientDTO.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantite);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", quantite='" + getQuantite() + "'" +
            "}";
    }

    //#endregion
}
