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
    @JoinTable(
            name = "fcategorie",
            joinColumns = @JoinColumn(name = "franchise_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private List<Categorie> categories;

    @OneToMany(targetEntity = Commande.class, mappedBy = "franchise")
    private List<Commande> commandes;

    @ManyToOne(targetEntity = Adresse.class, cascade = CascadeType.ALL)
    private Adresse adresse;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franchise franchise = (Franchise) o;
        return estSupprime == franchise.estSupprime && Objects.equals(id, franchise.id) && Objects.equals(designation, franchise.designation) && Objects.equals(categories, franchise.categories) && Objects.equals(commandes, franchise.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, estSupprime, categories, commandes);
    }

    @Override
    public String toString() {
        return "Franchise{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", estSupprime=" + estSupprime +
                ", categories=" + categories +
                ", commandes=" + commandes +
                '}';
    }
}
