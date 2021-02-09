package fr.goodfood.ressource.error;

public class CommandeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CommandeNotFoundException(Long id) {
        super("La commande avec l'id " + id + " n'a pas été trouvée");
    }
}
