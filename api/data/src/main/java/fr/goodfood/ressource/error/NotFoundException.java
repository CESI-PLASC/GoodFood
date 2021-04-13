package fr.goodfood.ressource.error;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotFoundException(String id) {
        super(String.format("L'entite avec l'identifiant %S n'a pas été trouvée", id));
    }
}