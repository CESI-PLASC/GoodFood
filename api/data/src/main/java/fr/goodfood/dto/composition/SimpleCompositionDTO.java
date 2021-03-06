package fr.goodfood.dto.composition;

import java.util.Objects;

import fr.goodfood.dto.commande.SimpleCommandeDTO;
import fr.goodfood.dto.formule.SimpleFormuleDTO;
import fr.goodfood.dto.produit.SimpleProduitDTO;
import fr.goodfood.entity.keys.CompositionKey;

public class SimpleCompositionDTO {

    private CompositionKey id;
    private SimpleCommandeDTO commande;
    private SimpleFormuleDTO formule;
    private SimpleProduitDTO produit;
    private Integer quantite;

    // #region Générations

    public SimpleCompositionDTO() {
    }

    public SimpleCompositionDTO(CompositionKey id, SimpleCommandeDTO commande, SimpleFormuleDTO formule,
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

    public SimpleCompositionDTO id(CompositionKey id) {
        setId(id);
        return this;
    }

    public SimpleCompositionDTO commande(SimpleCommandeDTO commande) {
        setCommande(commande);
        return this;
    }

    public SimpleCompositionDTO formule(SimpleFormuleDTO formule) {
        setFormule(formule);
        return this;
    }

    public SimpleCompositionDTO produit(SimpleProduitDTO produit) {
        setProduit(produit);
        return this;
    }

    public SimpleCompositionDTO quantite(Integer quantite) {
        setQuantite(quantite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleCompositionDTO)) {
            return false;
        }
        SimpleCompositionDTO simpleCompositionDTO = (SimpleCompositionDTO) o;
        return Objects.equals(id, simpleCompositionDTO.id) && Objects.equals(commande, simpleCompositionDTO.commande)
                && Objects.equals(formule, simpleCompositionDTO.formule)
                && Objects.equals(produit, simpleCompositionDTO.produit)
                && Objects.equals(quantite, simpleCompositionDTO.quantite);
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
