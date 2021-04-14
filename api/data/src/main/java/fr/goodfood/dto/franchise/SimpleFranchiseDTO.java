package fr.goodfood.dto.franchise;

import java.util.Objects;

import fr.goodfood.dto.adresse.SimpleAdresseDTO;

public class SimpleFranchiseDTO {
    private Long id;
    private String designation;
    private Boolean estSupprime;
    private String email;
    private String telephoneFixe;
    private String telephoneMobile;
    private SimpleAdresseDTO adresse;

    // #region Générations

    public SimpleFranchiseDTO() {
    }

    public SimpleFranchiseDTO(Long id, String designation, Boolean estSupprime, String email, String telephoneFixe,
            String telephoneMobile, SimpleAdresseDTO adresse) {
        this.id = id;
        this.designation = designation;
        this.estSupprime = estSupprime;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
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

    public SimpleAdresseDTO getAdresse() {
        return this.adresse;
    }

    public void setAdresse(SimpleAdresseDTO adresse) {
        this.adresse = adresse;
    }

    public SimpleFranchiseDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleFranchiseDTO designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public SimpleFranchiseDTO estSupprime(Boolean estSupprime) {
        setEstSupprime(estSupprime);
        return this;
    }

    public SimpleFranchiseDTO email(String email) {
        setEmail(email);
        return this;
    }

    public SimpleFranchiseDTO telephoneFixe(String telephoneFixe) {
        setTelephoneFixe(telephoneFixe);
        return this;
    }

    public SimpleFranchiseDTO telephoneMobile(String telephoneMobile) {
        setTelephoneMobile(telephoneMobile);
        return this;
    }

    public SimpleFranchiseDTO adresse(SimpleAdresseDTO adresse) {
        setAdresse(adresse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleFranchiseDTO)) {
            return false;
        }
        SimpleFranchiseDTO simpleFranchiseDTO = (SimpleFranchiseDTO) o;
        return Objects.equals(id, simpleFranchiseDTO.id) && Objects.equals(designation, simpleFranchiseDTO.designation)
                && Objects.equals(estSupprime, simpleFranchiseDTO.estSupprime)
                && Objects.equals(email, simpleFranchiseDTO.email)
                && Objects.equals(telephoneFixe, simpleFranchiseDTO.telephoneFixe)
                && Objects.equals(telephoneMobile, simpleFranchiseDTO.telephoneMobile)
                && Objects.equals(adresse, simpleFranchiseDTO.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, estSupprime, email, telephoneFixe, telephoneMobile, adresse);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", designation='" + getDesignation() + "'" + ", estSupprime='"
                + isEstSupprime() + "'" + ", email='" + getEmail() + "'" + ", telephoneFixe='" + getTelephoneFixe()
                + "'" + ", telephoneMobile='" + getTelephoneMobile() + "'" + ", adresse='" + getAdresse() + "'" + "}";
    }

    // #endregion
}
