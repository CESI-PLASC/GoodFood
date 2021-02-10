package fr.goodfood.dto.produit;

import java.util.Objects;

public class SimpleProduitDTO {

    private Long id;
    private String designation;
    private float prix;

    /**
     * Récupère : id.
     *
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Défini la nouvelle valeur de : id.
     *
     * @param id La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public SimpleProduitDTO setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Récupère : designation.
     *
     * @return designation.
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Défini la nouvelle valeur de : designation.
     *
     * @param designation La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public SimpleProduitDTO setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Récupère : prix.
     *
     * @return prix.
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Défini la nouvelle valeur de : prix.
     *
     * @param prix La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public SimpleProduitDTO setPrix(float prix) {
        this.prix = prix;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleProduitDTO that = (SimpleProduitDTO) o;
        return Float.compare(that.prix, prix) == 0 && Objects.equals(id, that.id) && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, prix);
    }
}
