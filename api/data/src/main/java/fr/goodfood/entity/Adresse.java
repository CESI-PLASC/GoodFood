package fr.goodfood.entity;

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
}
