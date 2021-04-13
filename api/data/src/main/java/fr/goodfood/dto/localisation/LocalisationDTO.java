package fr.goodfood.dto.localisation;

import java.util.Objects;

import fr.goodfood.dto.adresse.AdresseDTO;
import fr.goodfood.dto.utilisateur.UtilisateurDTO;
import fr.goodfood.entity.keys.LocalisationKey;

public class LocalisationDTO {
    private LocalisationKey id;
    private UtilisateurDTO utilisateur;
    private AdresseDTO adresse;
    private Boolean preferee;

    // #region Générations

    public LocalisationDTO() {
    }

    public LocalisationDTO(LocalisationKey id, UtilisateurDTO utilisateur, AdresseDTO adresse, Boolean preferee) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.adresse = adresse;
        this.preferee = preferee;
    }

    public LocalisationKey getId() {
        return this.id;
    }

    public void setId(LocalisationKey id) {
        this.id = id;
    }

    public UtilisateurDTO getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
    }

    public AdresseDTO getAdresse() {
        return this.adresse;
    }

    public void setAdresse(AdresseDTO adresse) {
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

    public LocalisationDTO id(LocalisationKey id) {
        setId(id);
        return this;
    }

    public LocalisationDTO utilisateur(UtilisateurDTO utilisateur) {
        setUtilisateur(utilisateur);
        return this;
    }

    public LocalisationDTO adresse(AdresseDTO adresse) {
        setAdresse(adresse);
        return this;
    }

    public LocalisationDTO preferee(Boolean preferee) {
        setPreferee(preferee);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LocalisationDTO)) {
            return false;
        }
        LocalisationDTO localisationDTO = (LocalisationDTO) o;
        return Objects.equals(id, localisationDTO.id) && Objects.equals(utilisateur, localisationDTO.utilisateur)
                && Objects.equals(adresse, localisationDTO.adresse)
                && Objects.equals(preferee, localisationDTO.preferee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, utilisateur, adresse, preferee);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", utilisateur='" + getUtilisateur() + "'" + ", adresse='" + getAdresse()
                + "'" + ", preferee='" + isPreferee() + "'" + "}";
    }

    // #endregion
}
