package fr.goodfood.dto.franchise;

import fr.goodfood.dto.adresse.SimpleAdresseDTO;
import fr.goodfood.dto.categorie.SimpleCategorieDTO;
import fr.goodfood.dto.commande.SimpleCommandeDTO;

import java.util.List;
import java.util.Objects;

public class FranchiseDTO {
    private Long id;
    private String designation;
    private Boolean estSupprime;
    private String email;
    private String telephoneFixe;
    private String telephoneMobile;
    private List<SimpleCommandeDTO> commandes;
    private List<SimpleCategorieDTO> categories;
    private SimpleAdresseDTO adresse;

    // #region Générations

    public FranchiseDTO() {
    }

    public FranchiseDTO(Long id, String designation, Boolean estSupprime, String email, String telephoneFixe,
            String telephoneMobile, List<SimpleCommandeDTO> commandes, List<SimpleCategorieDTO> categories,
            SimpleAdresseDTO adresse) {
        this.id = id;
        this.designation = designation;
        this.estSupprime = estSupprime;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.commandes = commandes;
        this.categories = categories;
        this.adresse = adresse;
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

    public Boolean isEstSupprime() {
        return this.estSupprime;
    }

    public Boolean getEstSupprime() {
        return this.estSupprime;
    }

    public void setEstSupprime(Boolean estSupprime) {
        this.estSupprime = estSupprime;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneFixe() {
        return this.telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTelephoneMobile() {
        return this.telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public List<SimpleCommandeDTO> getCommandes() {
        return this.commandes;
    }

    public void setCommandes(List<SimpleCommandeDTO> commandes) {
        this.commandes = commandes;
    }

    public List<SimpleCategorieDTO> getCategories() {
        return this.categories;
    }

    public void setCategories(List<SimpleCategorieDTO> categories) {
        this.categories = categories;
    }

    public SimpleAdresseDTO getAdresse() {
        return this.adresse;
    }

    public void setAdresse(SimpleAdresseDTO adresse) {
        this.adresse = adresse;
    }

    public FranchiseDTO id(Long id) {
        setId(id);
        return this;
    }

    public FranchiseDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public FranchiseDTO estSupprime(Boolean estSupprime) {
        setEstSupprime(estSupprime);
        return this;
    }

    public FranchiseDTO email(String email) {
        setEmail(email);
        return this;
    }

    public FranchiseDTO telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public FranchiseDTO telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public FranchiseDTO commandes(List<SimpleCommandeDTO> commandes) {
        setCommandes(commandes);
        return this;
    }

    public FranchiseDTO categories(List<SimpleCategorieDTO> categories) {
        setCategories(categories);
        return this;
    }

    public FranchiseDTO adresse(SimpleAdresseDTO adresse) {
        setAdresse(adresse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FranchiseDTO)) {
            return false;
        }
        FranchiseDTO franchiseDTO = (FranchiseDTO) o;
        return Objects.equals(id, franchiseDTO.id) && Objects.equals(designation, franchiseDTO.designation)
                && Objects.equals(estSupprime, franchiseDTO.estSupprime) && Objects.equals(email, franchiseDTO.email)
                && Objects.equals(telephoneFixe, franchiseDTO.telephoneFixe)
                && Objects.equals(telephoneMobile, franchiseDTO.telephoneMobile)
                && Objects.equals(commandes, franchiseDTO.commandes)
                && Objects.equals(categories, franchiseDTO.categories) && Objects.equals(adresse, franchiseDTO.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, estSupprime, email, telephoneFixe, telephoneMobile, commandes, categories,
                adresse);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", estSupprime='"
                + isEstSupprime() + "'" + ", email='" + getEmail() + "'" + ", telephoneFixe='" + getTelephoneFixe()
                + "'" + ", telephoneMobile='" + getTelephoneMobile() + "'" + ", commandes='" + getCommandes() + "'"
                + ", categories='" + getCategories() + "'" + ", adresse='" + getAdresse() + "'" + "}";
    }

    // #endregion
}
