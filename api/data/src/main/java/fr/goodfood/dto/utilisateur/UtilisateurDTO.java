package fr.goodfood.dto.utilisateur;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.commande.CommandeDTO;
import fr.goodfood.dto.localisation.LocalisationSDTO;

public class UtilisateurDTO {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String telephoneFixe;
    private String telephoneMobile;
    private String stripe;
    List<CommandeDTO> commandes;
    List<LocalisationSDTO> localisations;

    // #region Générations

    public UtilisateurDTO() {
    }

    public UtilisateurDTO(Long id, String nom, String prenom, Date dateNaissance, String email, String telephoneFixe,
            String telephoneMobile, String stripe, List<CommandeDTO> commandes, List<LocalisationSDTO> localisations) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.stripe = stripe;
        this.commandes = commandes;
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

    public List<CommandeDTO> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<CommandeDTO> commandes) {
        this.commandes = commandes;
    }

    public List<LocalisationSDTO> getLocalisations() {
        return this.localisations;
    }

    public void setLocalisations(List<LocalisationSDTO> localisations) {
        this.localisations = localisations;
    }

    public UtilisateurDTO id(Long id) {
        setId(id);
        return this;
    }

    public UtilisateurDTO nom(String nom) {
        setNom(nom);
        return this;
    }

    public UtilisateurDTO prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public UtilisateurDTO dateNaissance(Date dateNaissance) {
        setDateNaissance(dateNaissance);
        return this;
    }

    public UtilisateurDTO email(String email) {
        setEmail(email);
        return this;
    }

    public UtilisateurDTO telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public UtilisateurDTO telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public UtilisateurDTO stripe(String stripe) {
        setStripe(stripe);
        return this;
    }

    public UtilisateurDTO commandes(List<CommandeDTO> commandes) {
        setCommandes(commandes);
        return this;
    }

    public UtilisateurDTO localisations(List<LocalisationSDTO> localisations) {
        setLocalisations(localisations);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UtilisateurDTO)) {
            return false;
        }
        UtilisateurDTO utilisateurDTO = (UtilisateurDTO) o;
        return Objects.equals(id, utilisateurDTO.id) && Objects.equals(nom, utilisateurDTO.nom)
                && Objects.equals(prenom, utilisateurDTO.prenom)
                && Objects.equals(dateNaissance, utilisateurDTO.dateNaissance)
                && Objects.equals(email, utilisateurDTO.email)
                && Objects.equals(telephoneFixe, utilisateurDTO.telephoneFixe)
                && Objects.equals(telephoneMobile, utilisateurDTO.telephoneMobile)
                && Objects.equals(stripe, utilisateurDTO.stripe) && Objects.equals(commandes, utilisateurDTO.commandes)
                && Objects.equals(localisations, utilisateurDTO.localisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateNaissance, email, telephoneFixe, telephoneMobile, stripe, commandes,
                localisations);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nom='" + getNom() + "'" + ", prenom='" + getPrenom() + "'"
                + ", dateNaissance='" + getDateNaissance() + "'" + ", email='" + getEmail() + "'" + ", telephoneFixe='"
                + getTelephoneFixe() + "'" + ", telephoneMobile='" + getTelephoneMobile() + "'" + ", stripe='"
                + getStripe() + "'" + ", commandes='" + getCommandes() + "'" + ", localisations='" + getLocalisations()
                + "'" + "}";
    }

    // #endregion
}
