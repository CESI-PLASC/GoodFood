package fr.goodfood.dto.adresse;

import java.util.Objects;

public class AdresseDTO {
    
    private Long id;
    private String pays;
    private String codePostal;
    private String rue;
    private String ville;
    private String complement;

    //#region Générations

    public AdresseDTO() {
    }

    public AdresseDTO(Long id, String pays, String codePostal, String rue, String ville, String complement) {
        this.id = id;
        this.pays = pays;
        this.codePostal = codePostal;
        this.rue = rue;
        this.ville = ville;
        this.complement = complement;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getRue() {
        return this.rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public AdresseDTO id(Long id) {
        setId(id);
        return this;
    }

    public AdresseDTO pays(String pays) {
        setPays(pays);
        return this;
    }

    public AdresseDTO codePostal(String codePostal) {
        setCodePostal(codePostal);
        return this;
    }

    public AdresseDTO rue(String rue) {
        setRue(rue);
        return this;
    }

    public AdresseDTO ville(String ville) {
        setVille(ville);
        return this;
    }

    public AdresseDTO complement(String complement) {
        setComplement(complement);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AdresseDTO)) {
            return false;
        }
        AdresseDTO adresseDto = (AdresseDTO) o;
        return Objects.equals(id, adresseDto.id) && Objects.equals(pays, adresseDto.pays) && Objects.equals(codePostal, adresseDto.codePostal) && Objects.equals(rue, adresseDto.rue) && Objects.equals(ville, adresseDto.ville) && Objects.equals(complement, adresseDto.complement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pays, codePostal, rue, ville, complement);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", pays='" + getPays() + "'" +
            ", codePostal='" + getCodePostal() + "'" +
            ", rue='" + getRue() + "'" +
            ", ville='" + getVille() + "'" +
            ", complement='" + getComplement() + "'" +
            "}";
    }

    //#endregion
}
