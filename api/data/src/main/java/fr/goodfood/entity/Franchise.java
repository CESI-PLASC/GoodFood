package fr.goodfood.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Franchise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "est_supprime", nullable = false)
    private Boolean estSupprime = false;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telephone_fixe")
    private String telephoneFixe = null;

    @Column(name = "telephone_mobile")
    private String telephoneMobile = null;

    @ManyToMany(targetEntity = Categorie.class)
    @JoinTable(name = "fcategorie", joinColumns = @JoinColumn(name = "franchise_id"), inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private List<Categorie> categories;

    @OneToMany(targetEntity = Commande.class, mappedBy = "franchise")
    private List<Commande> commandes;

    @ManyToOne(targetEntity = Adresse.class, cascade = CascadeType.ALL)
    private Adresse adresse;

    // #region Générations

    public Franchise() {
    }

    public Franchise(Long id, String designation, Boolean estSupprime, String email, String telephoneFixe,
            String telephoneMobile, List<Categorie> categories, List<Commande> commandes, Adresse adresse) {
        this.id = id;
        this.designation = designation;
        this.estSupprime = estSupprime;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.categories = categories;
        this.commandes = commandes;
        this.adresse = adresse;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Boolean isEstSupprime() {
        return this.estSupprime;
    }

    public Boolean getEstSupprime() {
        return this.estSupprime;
    }

    public void setEstSupprime(Boolean estSupprime) {
        this.estSupprime = estSupprime;
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

    public List<Categorie> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public List<Commande> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Franchise id(Long id) {
        setId(id);
        return this;
    }

    public Franchise designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Franchise estSupprime(Boolean estSupprime) {
        setEstSupprime(estSupprime);
        return this;
    }

    public Franchise email(String email) {
        setEmail(email);
        return this;
    }

    public Franchise telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public Franchise telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public Franchise categories(List<Categorie> categories) {
        setCategories(categories);
        return this;
    }

    public Franchise commandes(List<Commande> commandes) {
        setCommandes(commandes);
        return this;
    }

    public Franchise adresse(Adresse adresse) {
        setAdresse(adresse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Franchise)) {
            return false;
        }
        Franchise franchise = (Franchise) o;
        return Objects.equals(id, franchise.id) && Objects.equals(designation, franchise.designation)
                && Objects.equals(estSupprime, franchise.estSupprime) && Objects.equals(email, franchise.email)
                && Objects.equals(telephoneFixe, franchise.telephoneFixe)
                && Objects.equals(telephoneMobile, franchise.telephoneMobile)
                && Objects.equals(categories, franchise.categories) && Objects.equals(commandes, franchise.commandes)
                && Objects.equals(adresse, franchise.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, estSupprime, email, telephoneFixe, telephoneMobile, categories, commandes,
                adresse);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", estSupprime='"
                + isEstSupprime() + "'" + ", email='" + getEmail() + "'" + ", telephoneFixe='" + getTelephoneFixe()
                + "'" + ", telephoneMobile='" + getTelephoneMobile() + "'" + ", categories='" + getCategories() + "'"
                + ", commandes='" + getCommandes() + "'" + ", adresse='" + getAdresse() + "'" + "}";
    }

    // #endregion
}
