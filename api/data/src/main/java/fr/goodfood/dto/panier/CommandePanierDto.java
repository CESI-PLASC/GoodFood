package fr.goodfood.dto.panier;

import java.util.List;

import fr.goodfood.dto.commande.SimpleCommandeDTO;

public class CommandePanierDto extends SimpleCommandeDTO{
    
    private List<FormulePanierDto> formules;

    public List<FormulePanierDto> getFormules(){
        return this.formules;
    }

    public void setFormules(List<FormulePanierDto> formules){
        this.formules = formules;
    }
}
