package fr.goodfood.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contenu {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Formule formule;

    @OneToMany(mappedBy = "contenu")
    private List<Contient> produits;

    @ManyToOne
    private Commande commande;

    // #region Générations

    public Contenu() {
    }

    public Contenu(Long id, Formule formule, List<Contient> produits, Commande commande) {
        this.id = id;
        this.formule = formule;
        this.produits = produits;
        this.commande = commande;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Formule getFormule() {
        return this.formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public List<Contient> getProduits() {
        return this.produits;
    }

    public void setProduits(List<Contient> produits) {
        this.produits = produits;
    }

    public Commande getCommande() {
        return this.commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Contenu id(Long id) {
        setId(id);
        return this;
    }

    public Contenu formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public Contenu produits(List<Contient> produits) {
        setProduits(produits);
        return this;
    }

    public Contenu commande(Commande commande) {
        setCommande(commande);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contenu)) {
            return false;
        }
        Contenu contenu = (Contenu) o;
        return Objects.equals(id, contenu.id) && Objects.equals(formule, contenu.formule)
                && Objects.equals(produits, contenu.produits) && Objects.equals(commande, contenu.commande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formule, produits, commande);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", formule='" + getFormule() + "'" + ", produits='" + getProduits() + "'"
                + ", commande='" + getCommande() + "'" + "}";
    }

    // #endregion
}
