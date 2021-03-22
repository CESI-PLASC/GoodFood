package fr.goodfood.entity.keys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class ContientKey implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(name = "contenu_id")
    private Long contenuId;

    @Column(name = "produit_id")
    private Long produitId;

    //#region Générations

    public ContientKey() {
    }

    public ContientKey(Long contenuId, Long produitId) {
        this.contenuId = contenuId;
        this.produitId = produitId;
    }

    public Long getContenuId() {
        return this.contenuId;
    }

    public void setContenuId(Long contenuId) {
        this.contenuId = contenuId;
    }

    public Long getProduitId() {
        return this.produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    public ContientKey contenuId(Long contenuId) {
        setContenuId(contenuId);
        return this;
    }

    public ContientKey produitId(Long produitId) {
        setProduitId(produitId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContientKey)) {
            return false;
        }
        ContientKey contientKey = (ContientKey) o;
        return Objects.equals(contenuId, contientKey.contenuId) && Objects.equals(produitId, contientKey.produitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contenuId, produitId);
    }

    @Override
    public String toString() {
        return "{" +
            " contenuId='" + getContenuId() + "'" +
            ", produitId='" + getProduitId() + "'" +
            "}";
    }

    //#endregion
}
