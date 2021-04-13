package fr.goodfood.dto.commande;

import java.sql.Date;
import java.util.Objects;

import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.dto.statut.SimpleStatutDTO;
import fr.goodfood.dto.utilisateur.UtilisateurSDTO;

public class SimpleCommandeDTO {

    private Long id;
    private Date dateCreation;
    private Date dateDonnee;
    private SimpleStatutDTO statut;
    private SimpleFranchiseDTO franchise;
    private UtilisateurSDTO utilisateur;

    // #region Générations

    public SimpleCommandeDTO() {
    }

    public SimpleCommandeDTO(Long id, Date dateCreation, Date dateDonnee, SimpleStatutDTO statut,
            SimpleFranchiseDTO franchise, UtilisateurSDTO utilisateur) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.dateDonnee = dateDonnee;
        this.statut = statut;
        this.franchise = franchise;
        this.utilisateur = utilisateur;
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

    public UtilisateurSDTO getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(UtilisateurSDTO utilisateur) {
        this.utilisateur = utilisateur;
    }

    public SimpleCommandeDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleCommandeDTO dateCreation(Date dateCreation) {
        setDateCreation(dateCreation);
        return this;
    }

    public SimpleCommandeDTO dateDonnee(Date dateDonnee) {
        setDateDonnee(dateDonnee);
        return this;
    }

    public SimpleCommandeDTO statut(SimpleStatutDTO statut) {
        setStatut(statut);
        return this;
    }

    public SimpleCommandeDTO franchise(SimpleFranchiseDTO franchise) {
        setFranchise(franchise);
        return this;
    }

    public SimpleCommandeDTO utilisateur(UtilisateurSDTO utilisateur) {
        setUtilisateur(utilisateur);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleCommandeDTO)) {
            return false;
        }
        SimpleCommandeDTO simpleCommandeDTO = (SimpleCommandeDTO) o;
        return Objects.equals(id, simpleCommandeDTO.id) && Objects.equals(dateCreation, simpleCommandeDTO.dateCreation)
                && Objects.equals(dateDonnee, simpleCommandeDTO.dateDonnee)
                && Objects.equals(statut, simpleCommandeDTO.statut)
                && Objects.equals(franchise, simpleCommandeDTO.franchise)
                && Objects.equals(utilisateur, simpleCommandeDTO.utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateDonnee, statut, franchise, utilisateur);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", dateCreation='" + getDateCreation() + "'" + ", dateDonnee='"
                + getDateDonnee() + "'" + ", statut='" + getStatut() + "'" + ", franchise='" + getFranchise() + "'"
                + ", utilisateur='" + getUtilisateur() + "'" + "}";
    }

    // #endregion
}
