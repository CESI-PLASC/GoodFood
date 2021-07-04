package fr.goodfood.dto.propose;

import java.util.Objects;

import fr.goodfood.entity.Formule;
import fr.goodfood.entity.Franchise;
import fr.goodfood.entity.keys.ProposeKey;


public class ProposeDTO {

    private ProposeKey id;

    private Formule formule;
    private Franchise franchise;

    // #region Générations


    public ProposeDTO() {
    }

    public ProposeDTO(ProposeKey id, Formule formule, Franchise franchise) {
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

    public ProposeDTO id(ProposeKey id) {
        setId(id);
        return this;
    }

    public ProposeDTO formule(Formule formule) {
        setFormule(formule);
        return this;
    }

    public ProposeDTO franchise(Franchise franchise) {
        setFranchise(franchise);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProposeDTO)) {
            return false;
        }
        ProposeDTO proposeDTO = (ProposeDTO) o;
        return Objects.equals(id, proposeDTO.id) && Objects.equals(formule, proposeDTO.formule) && Objects.equals(franchise, proposeDTO.franchise);
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
