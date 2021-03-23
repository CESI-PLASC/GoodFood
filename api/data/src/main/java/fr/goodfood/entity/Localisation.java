package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.goodfood.entity.keys.LocalisationKey;

@Entity
public class Localisation {

    @EmbeddedId
    private LocalisationKey id;

    @Column(nullable = false)
    private Boolean preferee = false;

    @ManyToOne
    @MapsId("utilisateurId")
    private Utilisateur utilisateur;

    @ManyToOne
    @MapsId("adresseId")
    private Adresse adresse;

    // #region Générations

    public Localisation() {
    }

    public Localisation(LocalisationKey id, Boolean preferee, Utilisateur utilisateur, Adresse adresse) {
        this.id = id;
        this.preferee = preferee;
        this.utilisateur = utilisateur;
        this.adresse = adresse;
    }

    public LocalisationKey getId() {
        return this.id;
    }

    public void setId(LocalisationKey id) {
        this.id = id;
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

    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Localisation id(LocalisationKey id) {
        setId(id);
        return this;
    }

    public Localisation preferee(Boolean preferee) {
        setPreferee(preferee);
        return this;
    }

    public Localisation utilisateur(Utilisateur utilisateur) {
        setUtilisateur(utilisateur);
        return this;
    }

    public Localisation adresse(Adresse adresse) {
        setAdresse(adresse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Localisation)) {
            return false;
        }
        Localisation localisation = (Localisation) o;
        return Objects.equals(id, localisation.id) && Objects.equals(preferee, localisation.preferee)
                && Objects.equals(utilisateur, localisation.utilisateur)
                && Objects.equals(adresse, localisation.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preferee, utilisateur, adresse);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", preferee='" + isPreferee() + "'" + ", utilisateur='"
                + getUtilisateur() + "'" + ", adresse='" + getAdresse() + "'" + "}";
    }

    // #endregion
}
