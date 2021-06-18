package fr.goodfood.ressource.error;

public class ExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExistsException(String id) {
        super(String.format("L'entite avec l'identifiant %S existe déjà", id));
    }
}