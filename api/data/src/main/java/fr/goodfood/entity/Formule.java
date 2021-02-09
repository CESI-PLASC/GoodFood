package fr.goodfood.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formule{

    private @Id @GeneratedValue Long id;
    private String designation;
    private Double prix;
    private @OneToMany(mappedBy = "formule") Set<Composition> compositions;

    public Long getId(){
        return this.id;
    }

    public String getDesignation(){
        return this.designation;
    }

    public Double getPrix(){
        return this.prix;
    }

    public Set<Composition> getCompositions(){
        return this.compositions;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setPrix(Double prix){
        this.prix = prix;
    }
}