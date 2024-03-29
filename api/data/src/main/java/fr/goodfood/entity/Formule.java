package fr.goodfood.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Formule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "est_supprime", nullable = false)
    private Boolean est_supprime = false;

    @OneToMany(mappedBy = "formule")
    private List<Requiert> structure;

    @JsonBackReference
    @OneToMany(mappedBy = "formule")
    private List<Contenu> contenu;

    @ManyToMany(targetEntity = Franchise.class)
    @JoinTable(name = "propose", joinColumns = @JoinColumn(name = "formule_id"), inverseJoinColumns = @JoinColumn(name = "franchise_id"))
    private List<Franchise> franchises;

    // #region Générations

    public Formule() {
    }

    public Formule(Long id, String designation, Float prix, Boolean est_supprime, List<Requiert> structure,
            List<Contenu> contenu, List<Franchise> franchises) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.est_supprime = est_supprime;
        this.structure = structure;
        this.contenu = contenu;
        this.franchises = franchises;
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

    public Float getPrix() {
        return this.prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Boolean isEst_supprime() {
        return this.est_supprime;
    }

    public Boolean getEst_supprime() {
        return this.est_supprime;
    }

    public void setEst_supprime(Boolean est_supprime) {
        this.est_supprime = est_supprime;
    }

    public List<Requiert> getStructure() {
        return this.structure;
    }

    public void setStructure(List<Requiert> structure) {
        this.structure = structure;
    }

    public List<Contenu> getContenu() {
        return this.contenu;
    }

    public void setContenu(List<Contenu> contenu) {
        this.contenu = contenu;
    }

    public List<Franchise> getFranchises() {
        return this.franchises;
    }

    public void setFranchises(List<Franchise> franchises) {
        this.franchises = franchises;
    }

    public Formule id(Long id) {
        setId(id);
        return this;
    }

    public Formule designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public Formule prix(Float prix) {
        setPrix(prix);
        return this;
    }

    public Formule est_supprime(Boolean est_supprime) {
        setEst_supprime(est_supprime);
        return this;
    }

    public Formule structure(List<Requiert> structure) {
        setStructure(structure);
        return this;
    }

    public Formule contenu(List<Contenu> contenu) {
        setContenu(contenu);
        return this;
    }

    public Formule franchises(List<Franchise> franchises) {
        setFranchises(franchises);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Formule)) {
            return false;
        }
        Formule formule = (Formule) o;
        return Objects.equals(id, formule.id) && Objects.equals(designation, formule.designation)
                && Objects.equals(prix, formule.prix) && Objects.equals(est_supprime, formule.est_supprime)
                && Objects.equals(structure, formule.structure) && Objects.equals(contenu, formule.contenu)
                && Objects.equals(franchises, formule.franchises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, est_supprime, structure, contenu, franchises);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", prix='" + getPrix() + "'"
                + ", est_supprime='" + isEst_supprime() + "'" + ", structure='" + getStructure() + "'" + ", contenu='"
                + getContenu() + "'" + ", franchises='" + getFranchises() + "'" + "}";
    }

    // #endregion
}
