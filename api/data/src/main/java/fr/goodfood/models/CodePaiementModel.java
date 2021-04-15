package fr.goodfood.models;

import java.util.Objects;

public class CodePaiementModel {
    private String codePaiement;

    // #region Les générations

    public CodePaiementModel() {
    }

    public CodePaiementModel(String codePaiement) {
        this.codePaiement = codePaiement;
    }

    public String getCodePaiement() {
        return this.codePaiement;
    }

    public void setCodePaiement(String codePaiement) {
        this.codePaiement = codePaiement;
    }

    public CodePaiementModel codePaiement(String codePaiement) {
        setCodePaiement(codePaiement);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CodePaiementModel)) {
            return false;
        }
        CodePaiementModel codePaiement = (CodePaiementModel) o;
        return Objects.equals(codePaiement, codePaiement.codePaiement);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codePaiement);
    }

    @Override
    public String toString() {
        return "{" + " codePaiement='" + getCodePaiement() + "'" + "}";
    }

    // #endregion
}
