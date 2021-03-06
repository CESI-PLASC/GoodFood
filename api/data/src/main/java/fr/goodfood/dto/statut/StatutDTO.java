package fr.goodfood.dto.statut;

import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.commande.SimpleCommandeDTO;

public class StatutDTO {

    private Long id;
    private String designation;
    private List<SimpleCommandeDTO> commandes;

    // #region Générations

    public StatutDTO() {
    }

    public StatutDTO(Long id, String designation, List<SimpleCommandeDTO> commandes) {
        this.id = id;
        this.designation = designation;
        this.commandes = commandes;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<SimpleCommandeDTO> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<SimpleCommandeDTO> commandes) {
        this.commandes = commandes;
    }

    public StatutDTO id(Long id) {
        setId(id);
        return this;
    }

    public StatutDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public StatutDTO commandes(List<SimpleCommandeDTO> commandes) {
        setCommandes(commandes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StatutDTO)) {
            return false;
        }
        StatutDTO statutDTO = (StatutDTO) o;
        return Objects.equals(id, statutDTO.id) && Objects.equals(designation, statutDTO.designation)
                && Objects.equals(commandes, statutDTO.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, commandes);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", commandes='"
                + getCommandes() + "'" + "}";
    }

    // #endregion
}
