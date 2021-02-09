package fr.goodfood.ressource.error;

public class ProduitNotFoundException  extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ProduitNotFoundException(Long id) {
        super("Le produit avec l'id " + id + " n'a pas été trouvée");
    }
}