package fr.goodfood.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "designation")
    private String designation;

    @OneToMany(mappedBy = "statut", targetEntity = Commande.class)
    private List<Commande> commandes;

    public Long getId(){
        return this.id;
    }

    public String getDesignation(){
        return this.designation;
    }

    public List<Commande> getCommandes(){
        return this.commandes;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setCommandes(List<Commande> commandes){
        this.commandes = commandes;
    }

    public void addCommande(Commande commande){
        this.commandes.add(commande);
    }
}