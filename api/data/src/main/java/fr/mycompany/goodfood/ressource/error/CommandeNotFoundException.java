package fr.mycompany.goodfood.ressource.error;

public class CommandeNotFoundException extends RuntimeException {
    
    public CommandeNotFoundException(Long id){
        super("La commande avec l'id " + id + " n'a pas été trouvée");
    }
}
