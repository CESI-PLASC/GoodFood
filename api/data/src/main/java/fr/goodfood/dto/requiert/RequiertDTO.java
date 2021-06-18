package fr.goodfood.dto.requiert;

import java.util.Objects;

import fr.goodfood.dto.categorie.SimpleCategorieDTO;
import fr.goodfood.entity.keys.RequiertKey;

public class RequiertDTO {
    private RequiertKey id;
    private SimpleCategorieDTO categorie;
    private Long quantite;

    // #region Générations

    public RequiertDTO() {
    }

    public RequiertDTO(RequiertKey id, SimpleCategorieDTO categorie, Long quantite) {
        this.id = id;
        this.categorie = categorie;
        this.quantite = quantite;
    }

    public RequiertKey getId() {
        return this.id;
    }

    public void setId(RequiertKey id) {
        this.id = id;
    }

    public SimpleCategorieDTO getCategorie() {
        return this.categorie;
    }

    public void setCategorie(SimpleCategorieDTO categorie) {
        this.categorie = categorie;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public RequiertDTO id(RequiertKey id) {
        setId(id);
        return this;
    }

    public RequiertDTO categorie(SimpleCategorieDTO categorie) {
        setCategorie(categorie);
        return this;
    }

    public RequiertDTO quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequiertDTO)) {
            return false;
        }
        RequiertDTO requiertDTO = (RequiertDTO) o;
        return Objects.equals(id, requiertDTO.id) && Objects.equals(categorie, requiertDTO.categorie)
                && Objects.equals(quantite, requiertDTO.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categorie, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", categorie='" + getCategorie() + "'" + ", quantite='" + getQuantite()
                + "'" + "}";
    }

    // #endregion
}
