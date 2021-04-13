package fr.goodfood.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String designation;

    @OneToMany(mappedBy = "statut", targetEntity = Commande.class)
    private List<Commande> commandes;

    // #region Générations

    public Statut() {
    }

    public Statut(Long id, String designation, List<Commande> commandes) {
        this.id = id;
        this.designation = designation;
        this.commandes = commandes;
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

    public List<Commande> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public Statut id(Long id) {
        setId(id);
        return this;
    }

    public Statut designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Statut commandes(List<Commande> commandes) {
        setCommandes(commandes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Statut)) {
            return false;
        }
        Statut statut = (Statut) o;
        return Objects.equals(id, statut.id) && Objects.equals(designation, statut.designation)
                && Objects.equals(commandes, statut.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, commandes);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", commandes='"
                + getCommandes() + "'" + "}";
    }

    // #endregion
}
