package fr.mycompany.goodfood.dto.commande;

import java.sql.Date;

public class CommandeBase {
    public Date dateCreation;
    public Date dateDonnee;

    public Date getDateCreation(){
        return this.dateCreation;
    }

    public Date getDateDonnee(){
        return this.dateDonnee;
    }
    
    public void setDateCreation(Date dateCreation){
        this.dateCreation = dateCreation;
    }

    public void setDateDonnee(Date dateDonnee){
        this.dateDonnee = dateDonnee;
    }
}