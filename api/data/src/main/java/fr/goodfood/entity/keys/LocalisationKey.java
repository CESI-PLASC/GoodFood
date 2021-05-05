package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class LocalisationKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "uilisateur_id")
    private Long utilisateurId;

    @Column(name = "adresse_id")
    private Long adresseId;

    // #region Générations

    public LocalisationKey() {
    }

    public LocalisationKey(Long utilisateurId, Long adresseId) {
        this.utilisateurId = utilisateurId;
        this.adresseId = adresseId;
    }

    public Long getUtilisateurId() {
        return this.utilisateurId;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public Long getAdresseId() {
        return this.adresseId;
    }

    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public LocalisationKey utilisateurId(Long utilisateurId) {
        setUtilisateurId(utilisateurId);
        return this;
    }

    public LocalisationKey adresseId(Long adresseId) {
        setAdresseId(adresseId);
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
                && Objects.equals(adresseId, localisationKey.adresseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateurId, adresseId);
    }

    @Override
    public String toString() {
        return "{" + " utilisateurId='" + getUtilisateurId() + "'" + ", adresseId='" + getAdresseId() + "'" + "}";
    }

    // #endregion
}
