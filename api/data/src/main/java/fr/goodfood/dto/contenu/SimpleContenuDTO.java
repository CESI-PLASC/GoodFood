package fr.goodfood.dto.contenu;

import java.util.Objects;

public class SimpleContenuDTO {
    private Long id;

    // #region Générations

    public SimpleContenuDTO() {
    }

    public SimpleContenuDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleContenuDTO id(Long id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleContenuDTO)) {
            return false;
        }
        SimpleContenuDTO simpleContenuDTO = (SimpleContenuDTO) o;
        return Objects.equals(id, simpleContenuDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + "}";
    }

    // #endregion
}
