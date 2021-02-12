package fr.goodfood.dto.franchise;

import java.util.List;
import java.util.Objects;

public class SimpleFranchiseDTO {
    private Long id;
    private String designation;

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
    public SimpleFranchiseDTO setId(Long id) {
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
    public SimpleFranchiseDTO setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleFranchiseDTO that = (SimpleFranchiseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation);
    }

    @Override
    public String toString() {
        return "SimpleFranchiseDTO{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                '}';
    }
}
