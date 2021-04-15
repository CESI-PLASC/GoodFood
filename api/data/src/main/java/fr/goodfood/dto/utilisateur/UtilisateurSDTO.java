package fr.goodfood.dto.utilisateur;

import fr.goodfood.dto.localisation.LocalisationSDTO;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class UtilisateurSDTO {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String telephoneFixe;
    private String telephoneMobile;
    private String stripe;
    List<LocalisationSDTO> localisations;

    // #region Générations

    public UtilisateurSDTO() {
    }

    public UtilisateurSDTO(Long id, String nom, String prenom, Date dateNaissance, String email, String telephoneFixe,
            String telephoneMobile, String stripe, List<LocalisationSDTO> localisations) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.stripe = stripe;
        this.localisations = localisations;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneFixe() {
        return this.telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTelephoneMobile() {
        return this.telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getStripe() {
        return this.stripe;
    }

    public void setStripe(String stripe) {
        this.stripe = stripe;
    }

    public List<LocalisationSDTO> getLocalisations() {
        return this.localisations;
    }

    public void setLocalisations(List<LocalisationSDTO> localisations) {
        this.localisations = localisations;
    }

    public UtilisateurSDTO id(Long id) {
        setId(id);
        return this;
    }

    public UtilisateurSDTO nom(String nom) {
        setNom(nom);
        return this;
    }

    public UtilisateurSDTO prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public UtilisateurSDTO dateNaissance(Date dateNaissance) {
        setDateNaissance(dateNaissance);
        return this;
    }

    public UtilisateurSDTO email(String email) {
        setEmail(email);
        return this;
    }

    public UtilisateurSDTO telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public UtilisateurSDTO telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public UtilisateurSDTO stripe(String stripe) {
        setStripe(stripe);
        return this;
    }

    public UtilisateurSDTO localisations(List<LocalisationSDTO> localisations) {
        setLocalisations(localisations);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UtilisateurSDTO)) {
            return false;
        }
        UtilisateurSDTO utilisateurSDTO = (UtilisateurSDTO) o;
        return Objects.equals(id, utilisateurSDTO.id) && Objects.equals(nom, utilisateurSDTO.nom)
                && Objects.equals(prenom, utilisateurSDTO.prenom)
                && Objects.equals(dateNaissance, utilisateurSDTO.dateNaissance)
                && Objects.equals(email, utilisateurSDTO.email)
                && Objects.equals(telephoneFixe, utilisateurSDTO.telephoneFixe)
                && Objects.equals(telephoneMobile, utilisateurSDTO.telephoneMobile)
                && Objects.equals(stripe, utilisateurSDTO.stripe)
                && Objects.equals(localisations, utilisateurSDTO.localisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateNaissance, email, telephoneFixe, telephoneMobile, stripe,
                localisations);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nom='" + getNom() + "'" + ", prenom='" + getPrenom() + "'"
                + ", dateNaissance='" + getDateNaissance() + "'" + ", email='" + getEmail() + "'" + ", telephoneFixe='"
                + getTelephoneFixe() + "'" + ", telephoneMobile='" + getTelephoneMobile() + "'" + ", stripe='"
                + getStripe() + "'" + ", localisations='" + getLocalisations() + "'" + "}";
    }

    // #endregion
}
