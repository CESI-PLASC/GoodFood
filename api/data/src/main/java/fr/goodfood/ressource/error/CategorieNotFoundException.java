package fr.goodfood.ressource.error;

public class CategorieNotFoundException extends RuntimeException {

    public CategorieNotFoundException(Long id){
        super("La categorie avec l'id " + id + " n'a pas été trouvée");
    }
}
