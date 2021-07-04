package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.goodfood.entity.keys.ProposeKey;

@Entity
public class Propose {

    @EmbeddedId
    private ProposeKey id;

    // @JsonBackReference
    @ManyToOne
    @MapsId("formuleId")
    private Formule formule;

    @ManyToOne
    @MapsId("franchiseId")
    private Franchise franchise;


    // #region Générations


    public Propose() {
    }

    public Propose(ProposeKey id, Formule formule, Franchise franchise) {
        this.id = id;
        this.formule = formule;
        this.franchise = franchise;
    }

    public ProposeKey getId() {
        return this.id;
    }

    public void setId(ProposeKey id) {
        this.id = id;
    }

    public Formule getFormule() {
        return this.formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Franchise getFranchise() {
        return this.franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public Propose id(ProposeKey id) {
        setId(id);
        return this;
    }

    public Propose formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public Propose franchise(Franchise franchise) {
        setFranchise(franchise);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Propose)) {
            return false;
        }
        Propose propose = (Propose) o;
        return Objects.equals(id, propose.id) && Objects.equals(formule, propose.formule) && Objects.equals(franchise, propose.franchise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formule, franchise);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", formule='" + getFormule() + "'" +
            ", franchise='" + getFranchise() + "'" +
            "}";
    }


    // #endregion
}
