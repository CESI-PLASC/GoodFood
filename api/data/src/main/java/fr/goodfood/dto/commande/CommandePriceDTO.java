package fr.goodfood.dto.commande;

import java.util.Objects;

public class CommandePriceDTO {
    Long id;
    Double prix;

    // #region Générations

    public CommandePriceDTO() {
    }

    public CommandePriceDTO(Long id, Double prix) {
        this.id = id;
        this.prix = prix;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public CommandePriceDTO id(Long id) {
        setId(id);
        return this;
    }

    public CommandePriceDTO prix(Double prix) {
        setPrix(prix);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommandePriceDTO)) {
            return false;
        }
        CommandePriceDTO commandePriceDTO = (CommandePriceDTO) o;
        return Objects.equals(id, commandePriceDTO.id) && Objects.equals(prix, commandePriceDTO.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prix);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", prix='" + getPrix() + "'" + "}";
    }

    // #endregion
}
