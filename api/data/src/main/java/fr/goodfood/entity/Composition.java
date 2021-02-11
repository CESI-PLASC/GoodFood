package fr.goodfood.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.goodfood.entity.keys.CompositionKey;

import java.util.Objects;

@Entity
public class Composition{

    @EmbeddedId
    private CompositionKey id;

    @ManyToOne @MapsId("commandeId")
    private Commande commande;

    @ManyToOne @MapsId("formuleId")
    private Formule formule;

    private Double quantite;

    public CompositionKey getId(){
        return this.id;
    }

    public Commande getCommande(){
        return this.commande;
    }

    public Formule getFormule(){
        return this.formule;
    }

    public Double getQuantite(){
        return this.quantite;
    }

    public void setId(CompositionKey id){
        this.id = id;
    }

    public void setCommande(Commande commande){
        this.commande = commande;
    }

    public void setFormule(Formule formule){
        this.formule = formule;
    }

    public void setQuantite(Double quantite){
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composition that = (Composition) o;
        return Objects.equals(id, that.id) && Objects.equals(commande, that.commande) && Objects.equals(formule, that.formule) && Objects.equals(quantite, that.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commande, formule, quantite);
    }

    @Override
    public String toString() {
        return "Composition{" +
                "id=" + id +
                ", commande=" + commande +
                ", formule=" + formule +
                ", quantite=" + quantite +
                '}';
    }
}
