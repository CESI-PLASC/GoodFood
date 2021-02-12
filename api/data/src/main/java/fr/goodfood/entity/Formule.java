package fr.goodfood.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formule formule = (Formule) o;
        return Objects.equals(id, formule.id) && Objects.equals(designation, formule.designation) && Objects.equals(prix, formule.prix) && Objects.equals(compositions, formule.compositions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix, compositions);
    }

    @Override
    public String toString() {
        return "Formule{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", compositions=" + compositions +
                '}';
    }
}
