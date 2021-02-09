package fr.mycompany.goodfood.ressource.error;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Cet identifiant n'existe pas");
    }
}
