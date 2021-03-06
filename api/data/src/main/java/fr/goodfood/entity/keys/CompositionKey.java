package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

public class CompositionKey implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long commandeId;
    private Long formuleId;
    private Long produitId;

    // #region Générations

    public CompositionKey() {
    }

    public CompositionKey(Long commandeId, Long formuleId, Long produitId) {
        this.commandeId = commandeId;
        this.formuleId = formuleId;
        this.produitId = produitId;
    }

    public Long getCommandeId() {
        return this.commandeId;
    }

    public void setCommandeId(Long commandeId) {
        this.commandeId = commandeId;
    }

    public Long getFormuleId() {
        return this.formuleId;
    }

    public void setFormuleId(Long formuleId) {
        this.formuleId = formuleId;
    }

    public Long getProduitId() {
        return this.produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    public CompositionKey commandeId(Long commandeId) {
        setCommandeId(commandeId);
        return this;
    }

    public CompositionKey formuleId(Long formuleId) {
        setFormuleId(formuleId);
        return this;
    }

    public CompositionKey produitId(Long produitId) {
        setProduitId(produitId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CompositionKey)) {
            return false;
        }
        CompositionKey compositionKey = (CompositionKey) o;
        return Objects.equals(commandeId, compositionKey.commandeId)
                && Objects.equals(formuleId, compositionKey.formuleId)
                && Objects.equals(produitId, compositionKey.produitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandeId, formuleId, produitId);
    }

    @Override
    public String toString() {
        return "{" + " commandeId='" + getCommandeId() + "'" + ", formuleId='" + getFormuleId() + "'" + ", produitId='"
                + getProduitId() + "'" + "}";
    }

    // #endregion
}
