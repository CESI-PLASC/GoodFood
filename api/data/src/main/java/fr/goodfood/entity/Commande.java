package fr.goodfood.entity;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "date_donnee")
    private Date dateDonnee;

    @ManyToOne(targetEntity = Statut.class)
    private Statut statut;

    @ManyToOne(targetEntity = Franchise.class)
    private Franchise franchise;

    @OneToMany(mappedBy = "commande")
    private List<Contenu> formules;

    @ManyToOne
    private Utilisateur utilisateur;

    // #region Générations

    public Commande() {
    }

    public Commande(Long id, Date dateCreation, Date dateDonnee, Statut statut, Franchise franchise,
            List<Contenu> formules, Utilisateur utilisateur) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.dateDonnee = dateDonnee;
        this.statut = statut;
        this.franchise = franchise;
        this.formules = formules;
        this.utilisateur = utilisateur;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDonnee() {
        return this.dateDonnee;
    }

    public void setDateDonnee(Date dateDonnee) {
        this.dateDonnee = dateDonnee;
    }

    public Statut getStatut() {
        return this.statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Franchise getFranchise() {
        return this.franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public List<Contenu> getFormules() {
        return this.formules;
    }

    public void setFormules(List<Contenu> formules) {
        this.formules = formules;
    }

    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Commande id(Long id) {
        setId(id);
        return this;
    }

    public Commande dateCreation(Date dateCreation) {
        setDateCreation(dateCreation);
        return this;
    }

    public Commande dateDonnee(Date dateDonnee) {
        setDateDonnee(dateDonnee);
        return this;
    }

    public Commande statut(Statut statut) {
        setStatut(statut);
        return this;
    }

    public Commande franchise(Franchise franchise) {
        setFranchise(franchise);
        return this;
    }

    public Commande formules(List<Contenu> formules) {
        setFormules(formules);
        return this;
    }

    public Commande utilisateur(Utilisateur utilisateur) {
        setUtilisateur(utilisateur);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Commande)) {
            return false;
        }
        Commande commande = (Commande) o;
        return Objects.equals(id, commande.id) && Objects.equals(dateCreation, commande.dateCreation)
                && Objects.equals(dateDonnee, commande.dateDonnee) && Objects.equals(statut, commande.statut)
                && Objects.equals(franchise, commande.franchise) && Objects.equals(formules, commande.formules)
                && Objects.equals(utilisateur, commande.utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateDonnee, statut, franchise, formules, utilisateur);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", dateCreation='" + getDateCreation() + "'" + ", dateDonnee='"
                + getDateDonnee() + "'" + ", statut='" + getStatut() + "'" + ", franchise='" + getFranchise() + "'"
                + ", formules='" + getFormules() + "'" + ", utilisateur='" + getUtilisateur() + "'" + "}";
    }

    // #endregion
}
