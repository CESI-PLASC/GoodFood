package fr.goodfood.ressource.error;

public class FormuleNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FormuleNotFoundException(Long id){
        super("La formule avec l'id " + id + " n'a pas été trouvée");
    }
}
