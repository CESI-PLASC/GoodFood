package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class RequiertKey implements Serializable {

    @Column(name = "categorie_id")
    private Long categorieId;

    @Column(name = "formule_id")
    private Long formuleId;

    // #region Générations

    public RequiertKey() {
    }

    public RequiertKey(Long categorieId, Long formuleId) {
        this.categorieId = categorieId;
        this.formuleId = formuleId;
    }

    public Long getCategorieId() {
        return this.categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    public Long getFormuleId() {
        return this.formuleId;
    }

    public void setFormuleId(Long formuleId) {
        this.formuleId = formuleId;
    }

    public RequiertKey categorieId(Long categorieId) {
        setCategorieId(categorieId);
        return this;
    }

    public RequiertKey formuleId(Long formuleId) {
        setFormuleId(formuleId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequiertKey)) {
            return false;
        }
        RequiertKey requiertKey = (RequiertKey) o;
        return Objects.equals(categorieId, requiertKey.categorieId) && Objects.equals(formuleId, requiertKey.formuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categorieId, formuleId);
    }

    @Override
    public String toString() {
        return "{" + " categorieId='" + getCategorieId() + "'" + ", formuleId='" + getFormuleId() + "'" + "}";
    }

    // #endregion
}
