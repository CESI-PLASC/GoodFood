package fr.goodfood.dto.formule;

public class FormuleBase {

    private String designation;
    private Double prix;

    public String getDesignation(){
        return this.designation;
    }

    public Double getPrix(){
        return this.prix;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setPrix(Double prix){
        this.prix = prix;
    }
}
