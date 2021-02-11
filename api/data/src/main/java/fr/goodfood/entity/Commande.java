package fr.goodfood.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "date_donnee")
    private Date dateDonnee;

    @ManyToOne(targetEntity = Statut.class)
    private Statut statut;

    @ManyToOne(targetEntity = Franchise.class)
    private Franchise franchise;

    private @OneToMany(mappedBy = "formule") Set<Composition> compositions;

    public Long getId(){
        return this.id;
    }

    public Date getDateCreation(){
        return this.dateCreation;
    }

    public Date getDateDonnee(){
        return this.dateDonnee;
    }

    public Statut getStatut(){
        return this.statut;
    }

    public Set<Composition> getCompositions(){
        return this.compositions;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setDateCreation(Date dateCreation){
        this.dateCreation = dateCreation;
    }

    public void setDateDonnee(Date dateDonnee){
        this.dateDonnee = dateDonnee;
    }

    public void setStatut(Statut statut){
        this.statut = statut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(id, commande.id) && Objects.equals(dateCreation, commande.dateCreation) && Objects.equals(dateDonnee, commande.dateDonnee) && Objects.equals(statut, commande.statut) && Objects.equals(franchise, commande.franchise) && Objects.equals(compositions, commande.compositions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateDonnee, statut, franchise, compositions);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateCreation=" + dateCreation +
                ", dateDonnee=" + dateDonnee +
                ", statut=" + statut +
                ", franchise=" + franchise +
                ", compositions=" + compositions +
                '}';
    }
}
