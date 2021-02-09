package fr.goodfood.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formule{

    @Id @GeneratedValue 
    private Long id;
    private String designation;
    private Double prix;
    @OneToMany(mappedBy = "formule")
    private List<Composition> compositions;

    public Long getId(){
        return this.id;
    }

    public String getDesignation(){
        return this.designation;
    }

    public Double getPrix(){
        return this.prix;
    }

    public List<Composition> getCompositions(){
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