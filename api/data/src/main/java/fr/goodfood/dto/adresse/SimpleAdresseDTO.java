package fr.goodfood.dto.adresse;

import java.util.Objects;

public class SimpleAdresseDTO {
    
    private Long id;
    private String pays;
    private String codePostal;
    private String rue;
    private String ville;
    private String complement;

    //#region Génération

    public SimpleAdresseDTO() {
    }

    public SimpleAdresseDTO(Long id, String pays, String codePostal, String rue, String ville, String complement) {
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

    public SimpleAdresseDTO id(Long id) {
        setId(id);
        return this;
    }

    public SimpleAdresseDTO pays(String pays) {
        setPays(pays);
        return this;
    }

    public SimpleAdresseDTO codePostal(String codePostal) {
        setCodePostal(codePostal);
        return this;
    }

    public SimpleAdresseDTO rue(String rue) {
        setRue(rue);
        return this;
    }

    public SimpleAdresseDTO ville(String ville) {
        setVille(ville);
        return this;
    }

    public SimpleAdresseDTO complement(String complement) {
        setComplement(complement);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleAdresseDTO)) {
            return false;
        }
        SimpleAdresseDTO simpleAdresseDTO = (SimpleAdresseDTO) o;
        return Objects.equals(id, simpleAdresseDTO.id) && Objects.equals(pays, simpleAdresseDTO.pays) && Objects.equals(codePostal, simpleAdresseDTO.codePostal) && Objects.equals(rue, simpleAdresseDTO.rue) && Objects.equals(ville, simpleAdresseDTO.ville) && Objects.equals(complement, simpleAdresseDTO.complement);
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
