package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class ProposeKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "formule_id")
    private Long formuleId;

    @Column(name = "franchise_id")
    private Long franchiseId;

    // #region Générations


    public ProposeKey() {
    }

    public ProposeKey(Long formuleId, Long franchiseId) {
        this.formuleId = formuleId;
        this.franchiseId = franchiseId;
    }

    public Long getFormuleId() {
        return this.formuleId;
    }

    public void setFormuleId(Long formuleId) {
        this.formuleId = formuleId;
    }

    public Long getFranchiseId() {
        return this.franchiseId;
    }

    public void setFranchiseId(Long franchiseId) {
        this.franchiseId = franchiseId;
    }

    public ProposeKey formuleId(Long formuleId) {
        setFormuleId(formuleId);
        return this;
    }

    public ProposeKey franchiseId(Long franchiseId) {
        setFranchiseId(franchiseId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProposeKey)) {
            return false;
        }
        ProposeKey proposeKey = (ProposeKey) o;
        return Objects.equals(formuleId, proposeKey.formuleId) && Objects.equals(franchiseId, proposeKey.franchiseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formuleId, franchiseId);
    }

    @Override
    public String toString() {
        return "{" +
            " formuleId='" + getFormuleId() + "'" +
            ", franchiseId='" + getFranchiseId() + "'" +
            "}";
    }
    

    // #endregion
}
