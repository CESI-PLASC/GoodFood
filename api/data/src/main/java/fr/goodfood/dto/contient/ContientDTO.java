package fr.goodfood.dto.contient;

import java.util.Objects;

import fr.goodfood.dto.produit.ProduitDTO;
import fr.goodfood.entity.keys.ContientKey;

public class ContientDTO {
    private ContientKey id;
    private ProduitDTO produit;
    private Long quantite;

    // #region Générations

    public ContientDTO() {
    }

    public ContientDTO(ContientKey id, ProduitDTO produit, Long quantite) {
        this.id = id;
        this.produit = produit;
        this.quantite = quantite;
    }

    public ContientKey getId() {
        return this.id;
    }

    public void setId(ContientKey id) {
        this.id = id;
    }

    public ProduitDTO getProduit() {
        return this.produit;
    }

    public void setProduit(ProduitDTO produit) {
        this.produit = produit;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public ContientDTO id(ContientKey id) {
        setId(id);
        return this;
    }

    public ContientDTO produit(ProduitDTO produit) {
        setProduit(produit);
        return this;
    }

    public ContientDTO quantite(Long quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContientDTO)) {
            return false;
        }
        ContientDTO contientDTO = (ContientDTO) o;
        return Objects.equals(id, contientDTO.id) && Objects.equals(produit, contientDTO.produit)
                && Objects.equals(quantite, contientDTO.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, produit, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", produit='" + getProduit() + "'" + ", quantite='" + getQuantite() + "'"
                + "}";
    }

    // #endregion
}
