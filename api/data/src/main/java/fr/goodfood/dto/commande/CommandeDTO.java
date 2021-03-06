package fr.goodfood.dto.commande;

import java.sql.Date;
import java.util.Objects;

import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.dto.statut.SimpleStatutDTO;

public class CommandeDTO {

    private Long id;
    private Date dateCreation;
    private Date dateDonnee;
    private SimpleStatutDTO statut;
    private SimpleFranchiseDTO franchise;

    // #region Générations

    public CommandeDTO() {
    }

    public CommandeDTO(Long id, Date dateCreation, Date dateDonnee, SimpleStatutDTO statut,
            SimpleFranchiseDTO franchise) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.dateDonnee = dateDonnee;
        this.statut = statut;
        this.franchise = franchise;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDonnee() {
        return this.dateDonnee;
    }

    public void setDateDonnee(Date dateDonnee) {
        this.dateDonnee = dateDonnee;
    }

    public SimpleStatutDTO getStatut() {
        return this.statut;
    }

    public void setStatut(SimpleStatutDTO statut) {
        this.statut = statut;
    }

    public SimpleFranchiseDTO getFranchise() {
        return this.franchise;
    }

    public void setFranchise(SimpleFranchiseDTO franchise) {
        this.franchise = franchise;
    }

    public CommandeDTO id(Long id) {
        setId(id);
        return this;
    }

    public CommandeDTO dateCreation(Date dateCreation) {
        setDateCreation(dateCreation);
        return this;
    }

    public CommandeDTO dateDonnee(Date dateDonnee) {
        setDateDonnee(dateDonnee);
        return this;
    }

    public CommandeDTO statut(SimpleStatutDTO statut) {
        setStatut(statut);
        return this;
    }

    public CommandeDTO franchise(SimpleFranchiseDTO franchise) {
        setFranchise(franchise);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommandeDTO)) {
            return false;
        }
        CommandeDTO commandeDTO = (CommandeDTO) o;
        return Objects.equals(id, commandeDTO.id) && Objects.equals(dateCreation, commandeDTO.dateCreation)
                && Objects.equals(dateDonnee, commandeDTO.dateDonnee) && Objects.equals(statut, commandeDTO.statut)
                && Objects.equals(franchise, commandeDTO.franchise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateDonnee, statut, franchise);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", dateCreation='" + getDateCreation() + "'" + ", dateDonnee='"
                + getDateDonnee() + "'" + ", statut='" + getStatut() + "'" + ", franchise='" + getFranchise() + "'"
                + "}";
    }

    // #endregion
}
