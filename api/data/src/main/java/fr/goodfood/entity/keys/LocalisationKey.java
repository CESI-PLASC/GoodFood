package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class LocalisationKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "uilisateur_id")
    private Long utilisateurId;

    @Column(name = "adresse_id")
    private Long adresse_id;

    // #region Générations

    public LocalisationKey() {
    }

    public LocalisationKey(Long utilisateurId, Long adresse_id) {
        this.utilisateurId = utilisateurId;
        this.adresse_id = adresse_id;
    }

    public Long getUtilisateurId() {
        return this.utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public Long getAdresse_id() {
        return this.adresse_id;
    }

    public void setAdresse_id(Long adresse_id) {
        this.adresse_id = adresse_id;
    }

    public LocalisationKey utilisateurId(Long utilisateurId) {
        setUtilisateurId(utilisateurId);
        return this;
    }

    public LocalisationKey adresse_id(Long adresse_id) {
        setAdresse_id(adresse_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LocalisationKey)) {
            return false;
        }
        LocalisationKey localisationKey = (LocalisationKey) o;
        return Objects.equals(utilisateurId, localisationKey.utilisateurId)
                && Objects.equals(adresse_id, localisationKey.adresse_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateurId, adresse_id);
    }

    @Override
    public String toString() {
        return "{" + " utilisateurId='" + getUtilisateurId() + "'" + ", adresse_id='" + getAdresse_id() + "'" + "}";
    }

    // #endregion
}
