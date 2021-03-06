package fr.goodfood.dto.composition;

import java.util.Objects;

import fr.goodfood.dto.commande.SimpleCommandeDTO;
import fr.goodfood.dto.formule.SimpleFormuleDTO;
import fr.goodfood.dto.produit.SimpleProduitDTO;
import fr.goodfood.entity.keys.CompositionKey;

public class CompositionDTO {

    private CompositionKey id;
    private SimpleCommandeDTO commande;
    private SimpleFormuleDTO formule;
    private SimpleProduitDTO produit;
    private Integer quantite;

    // #region Générations

    public CompositionDTO() {
    }

    public CompositionDTO(CompositionKey id, SimpleCommandeDTO commande, SimpleFormuleDTO formule,
            SimpleProduitDTO produit, Integer quantite) {
        this.id = id;
        this.commande = commande;
        this.formule = formule;
        this.produit = produit;
        this.quantite = quantite;
    }

    public CompositionKey getId() {
        return this.id;
    }

    public void setId(CompositionKey id) {
        this.id = id;
    }

    public SimpleCommandeDTO getCommande() {
        return this.commande;
    }

    public void setCommande(SimpleCommandeDTO commande) {
        this.commande = commande;
    }

    public SimpleFormuleDTO getFormule() {
        return this.formule;
    }

    public void setFormule(SimpleFormuleDTO formule) {
        this.formule = formule;
    }

    public SimpleProduitDTO getProduit() {
        return this.produit;
    }

    public void setProduit(SimpleProduitDTO produit) {
        this.produit = produit;
    }

    public Integer getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public CompositionDTO id(CompositionKey id) {
        setId(id);
        return this;
    }

    public CompositionDTO commande(SimpleCommandeDTO commande) {
        setCommande(commande);
        return this;
    }

    public CompositionDTO formule(SimpleFormuleDTO formule) {
        setFormule(formule);
        return this;
    }

    public CompositionDTO produit(SimpleProduitDTO produit) {
        setProduit(produit);
        return this;
    }

    public CompositionDTO quantite(Integer quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CompositionDTO)) {
            return false;
        }
        CompositionDTO compositionDTO = (CompositionDTO) o;
        return Objects.equals(id, compositionDTO.id) && Objects.equals(commande, compositionDTO.commande)
                && Objects.equals(formule, compositionDTO.formule) && Objects.equals(produit, compositionDTO.produit)
                && Objects.equals(quantite, compositionDTO.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commande, formule, produit, quantite);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", commande='" + getCommande() + "'" + ", formule='" + getFormule() + "'"
                + ", produit='" + getProduit() + "'" + ", quantite='" + getQuantite() + "'" + "}";
    }

    // #endregion
}
