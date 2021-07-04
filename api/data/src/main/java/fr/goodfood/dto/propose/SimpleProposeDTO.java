package fr.goodfood.dto.propose;

import java.util.Objects;

import fr.goodfood.entity.Formule;
import fr.goodfood.entity.Franchise;
import fr.goodfood.entity.keys.ProposeKey;

public class SimpleProposeDTO {

    private ProposeKey id;
    private Formule formule;
    private Franchise franchise;

    // #region Générations


    public SimpleProposeDTO() {
    }

    public SimpleProposeDTO(ProposeKey id, Formule formule, Franchise franchise) {
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

    public SimpleProposeDTO id(ProposeKey id) {
        setId(id);
        return this;
    }

    public SimpleProposeDTO formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public SimpleProposeDTO franchise(Franchise franchise) {
        setFranchise(franchise);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleProposeDTO)) {
            return false;
        }
        SimpleProposeDTO simpleProposeDTO = (SimpleProposeDTO) o;
        return Objects.equals(id, simpleProposeDTO.id) && Objects.equals(formule, simpleProposeDTO.formule) && Objects.equals(franchise, simpleProposeDTO.franchise);
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
