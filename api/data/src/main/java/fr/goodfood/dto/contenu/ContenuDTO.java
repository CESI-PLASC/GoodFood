package fr.goodfood.dto.contenu;

import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.contient.ContientDTO;
import fr.goodfood.dto.formule.FormuleDTO;

public class ContenuDTO {
    private Long id;
    private FormuleDTO formule;
    private List<ContientDTO> produits;

    // #region Générations

    public ContenuDTO() {
    }

    public ContenuDTO(Long id, FormuleDTO formule, List<ContientDTO> produits) {
        this.id = id;
        this.formule = formule;
        this.produits = produits;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormuleDTO getFormule() {
        return this.formule;
    }

    public void setFormule(FormuleDTO formule) {
        this.formule = formule;
    }

    public List<ContientDTO> getProduits() {
        return this.produits;
    }

    public void setProduits(List<ContientDTO> produits) {
        this.produits = produits;
    }

    public ContenuDTO id(Long id) {
        setId(id);
        return this;
    }

    public ContenuDTO formule(FormuleDTO formule) {
        setFormule(formule);
        return this;
    }

    public ContenuDTO produits(List<ContientDTO> produits) {
        setProduits(produits);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContenuDTO)) {
            return false;
        }
        ContenuDTO contenuDTO = (ContenuDTO) o;
        return Objects.equals(id, contenuDTO.id) && Objects.equals(formule, contenuDTO.formule)
                && Objects.equals(produits, contenuDTO.produits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formule, produits);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", formule='" + getFormule() + "'" + ", produits='" + getProduits() + "'"
                + "}";
    }

    // #endregion
}
