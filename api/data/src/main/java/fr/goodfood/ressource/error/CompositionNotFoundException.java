package fr.goodfood.ressource.error;

import fr.goodfood.entity.keys.CompositionKey;

public class CompositionNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CompositionNotFoundException(CompositionKey id){
        super("La composition avec l'id " + id + " n'a pas été trouvée");
    }
}
