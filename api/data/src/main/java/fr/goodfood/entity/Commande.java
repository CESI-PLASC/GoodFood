package fr.goodfood.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)
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
    
    @OneToMany(mappedBy = "commande")
    private List<Composition> compositions;

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

    public List<Composition> getCompositions(){
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

    public void setCompositions(List<Composition> compositions){
        this.compositions = compositions;
    }
}
