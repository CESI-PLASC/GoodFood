package fr.goodfood.dto.commande;

import java.util.List;

import fr.goodfood.dto.formule.FormulePanierDto;

public class CommandePanierDto extends CommandeBase {
    
    private List<FormulePanierDto> formules;

    public List<FormulePanierDto> getFormules(){
        return this.formules;
    }

    public void setFormules(List<FormulePanierDto> formules){
        this.formules = formules;
    }
}
