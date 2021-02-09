package fr.goodfood.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
}
