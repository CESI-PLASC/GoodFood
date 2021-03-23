package fr.goodfood.dto.localisation;

import java.util.Objects;

import fr.goodfood.dto.adresse.SimpleAdresseDTO;
import fr.goodfood.entity.keys.LocalisationKey;

public class LocalisationSDTO {
    private LocalisationKey id;
    private SimpleAdresseDTO adresse;
    private Boolean preferee;

    // #region Générations

    public LocalisationSDTO() {
    }

    public LocalisationSDTO(LocalisationKey id, SimpleAdresseDTO adresse, Boolean preferee) {
        this.id = id;
        this.adresse = adresse;
        this.preferee = preferee;
    }

    public LocalisationKey getId() {
        return this.id;
    }

    public void setId(LocalisationKey id) {
        this.id = id;
    }

    public SimpleAdresseDTO getAdresse() {
        return this.adresse;
    }

    public void setAdresse(SimpleAdresseDTO adresse) {
        this.adresse = adresse;
    }

    public Boolean isPreferee() {
        return this.preferee;
    }

    public Boolean getPreferee() {
        return this.preferee;
    }

    public void setPreferee(Boolean preferee) {
        this.preferee = preferee;
    }

    public LocalisationSDTO id(LocalisationKey id) {
        setId(id);
        return this;
    }

    public LocalisationSDTO adresse(SimpleAdresseDTO adresse) {
        setAdresse(adresse);
        return this;
    }

    public LocalisationSDTO preferee(Boolean preferee) {
        setPreferee(preferee);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LocalisationSDTO)) {
            return false;
        }
        LocalisationSDTO localisationSDTO = (LocalisationSDTO) o;
        return Objects.equals(id, localisationSDTO.id) && Objects.equals(adresse, localisationSDTO.adresse)
                && Objects.equals(preferee, localisationSDTO.preferee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adresse, preferee);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", adresse='" + getAdresse() + "'" + ", preferee='" + isPreferee() + "'"
                + "}";
    }

    // #endregion
}
