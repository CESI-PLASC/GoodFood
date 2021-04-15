package fr.goodfood.entity;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(name = "date_naissance")
    private Date dateNaissance;

    @Column
    private String email;

    @Column(name = "telephone_fixe")
    private String telephoneFixe;

    @Column(name = "telephone_mobile")
    private String telephoneMobile;

    @Column(name = "stripe", nullable = false)
    private String stripe;

    @OneToMany(mappedBy = "utilisateur")
    List<Commande> commandes;

    @OneToMany(mappedBy = "utilisateur")
    List<Localisation> localisations;

    // #region Générations

    public Utilisateur() {
    }

    public Utilisateur(Long id, String nom, String prenom, Date dateNaissance, String email, String telephoneFixe,
            String telephoneMobile, String stripe, List<Commande> commandes, List<Localisation> localisations) {
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

    public List<Commande> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public List<Localisation> getLocalisations() {
        return this.localisations;
    }

    public void setLocalisations(List<Localisation> localisations) {
        this.localisations = localisations;
    }

    public Utilisateur id(Long id) {
        setId(id);
        return this;
    }

    public Utilisateur nom(String nom) {
        setNom(nom);
        return this;
    }

    public Utilisateur prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public Utilisateur dateNaissance(Date dateNaissance) {
        setDateNaissance(dateNaissance);
        return this;
    }

    public Utilisateur email(String email) {
        setEmail(email);
        return this;
    }

    public Utilisateur telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public Utilisateur telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public Utilisateur stripe(String stripe) {
        setStripe(stripe);
        return this;
    }

    public Utilisateur commandes(List<Commande> commandes) {
        setCommandes(commandes);
        return this;
    }

    public Utilisateur localisations(List<Localisation> localisations) {
        setLocalisations(localisations);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Utilisateur)) {
            return false;
        }
        Utilisateur utilisateur = (Utilisateur) o;
        return Objects.equals(id, utilisateur.id) && Objects.equals(nom, utilisateur.nom)
                && Objects.equals(prenom, utilisateur.prenom)
                && Objects.equals(dateNaissance, utilisateur.dateNaissance) && Objects.equals(email, utilisateur.email)
                && Objects.equals(telephoneFixe, utilisateur.telephoneFixe)
                && Objects.equals(telephoneMobile, utilisateur.telephoneMobile)
                && Objects.equals(stripe, utilisateur.stripe) && Objects.equals(commandes, utilisateur.commandes)
                && Objects.equals(localisations, utilisateur.localisations);
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
