package fr.goodfood.dto.commande;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import fr.goodfood.dto.contenu.ContenuDTO;
import fr.goodfood.dto.franchise.SimpleFranchiseDTO;
import fr.goodfood.dto.statut.SimpleStatutDTO;
import fr.goodfood.dto.utilisateur.UtilisateurSDTO;

public class CommandeDTO {

    private Long id;
    private Date dateCreation;
    private Date dateDonnee;
    private SimpleStatutDTO statut;
    private SimpleFranchiseDTO franchise;
    private List<ContenuDTO> formules;
    private UtilisateurSDTO utilisateur;

    // #region Générations

    public CommandeDTO() {
    }

    public CommandeDTO(Long id, Date dateCreation, Date dateDonnee, SimpleStatutDTO statut,
            SimpleFranchiseDTO franchise, List<ContenuDTO> formules, UtilisateurSDTO utilisateur) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.dateDonnee = dateDonnee;
        this.statut = statut;
        this.franchise = franchise;
        this.formules = formules;
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

    public List<ContenuDTO> getFormules() {
        return this.formules;
    }

    public void setFormules(List<ContenuDTO> formules) {
        this.formules = formules;
    }

    public UtilisateurSDTO getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(UtilisateurSDTO utilisateur) {
        this.utilisateur = utilisateur;
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

    public CommandeDTO formules(List<ContenuDTO> formules) {
        setFormules(formules);
        return this;
    }

    public CommandeDTO utilisateur(UtilisateurSDTO utilisateur) {
        setUtilisateur(utilisateur);
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
                && Objects.equals(franchise, commandeDTO.franchise) && Objects.equals(formules, commandeDTO.formules)
                && Objects.equals(utilisateur, commandeDTO.utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateDonnee, statut, franchise, formules, utilisateur);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", dateCreation='" + getDateCreation() + "'" + ", dateDonnee='"
                + getDateDonnee() + "'" + ", statut='" + getStatut() + "'" + ", franchise='" + getFranchise() + "'"
                + ", formules='" + getFormules() + "'" + ", utilisateur='" + getUtilisateur() + "'" + "}";
    }

    // #endregion
}
