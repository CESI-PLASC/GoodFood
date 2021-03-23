package fr.goodfood.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String pays;

    @Column(name = "code_postal")
    private String codePostal;

    @Column
    private String rue;

    @Column
    private String ville;

    @Column(nullable = true)
    private String complement = null;

    // #region Générations

    public Adresse() {
    }

    public Adresse(Long id, String pays, String codePostal, String rue, String ville, String complement) {
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

    public Adresse id(Long id) {
        setId(id);
        return this;
    }

    public Adresse pays(String pays) {
        setPays(pays);
        return this;
    }

    public Adresse codePostal(String codePostal) {
        setCodePostal(codePostal);
        return this;
    }

    public Adresse rue(String rue) {
        setRue(rue);
        return this;
    }

    public Adresse ville(String ville) {
        setVille(ville);
        return this;
    }

    public Adresse complement(String complement) {
        setComplement(complement);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Adresse)) {
            return false;
        }
        Adresse adresse = (Adresse) o;
        return Objects.equals(id, adresse.id) && Objects.equals(pays, adresse.pays)
                && Objects.equals(codePostal, adresse.codePostal) && Objects.equals(rue, adresse.rue)
                && Objects.equals(ville, adresse.ville) && Objects.equals(complement, adresse.complement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pays, codePostal, rue, ville, complement);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", pays='" + getPays() + "'" + ", codePostal='" + getCodePostal() + "'"
                + ", rue='" + getRue() + "'" + ", ville='" + getVille() + "'" + ", complement='" + getComplement() + "'"
                + "}";
    }

    // #endregion
}
