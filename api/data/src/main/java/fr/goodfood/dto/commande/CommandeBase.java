package fr.goodfood.dto.commande;

import java.sql.Date;

public class CommandeBase {
    private Date dateCreation;
    private Date dateDonnee;

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
