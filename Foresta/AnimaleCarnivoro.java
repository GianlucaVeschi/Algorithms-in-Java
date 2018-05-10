public class AnimaleCarnivoro extends Organismo{

	// COSTRUTTORI

	public AnimaleCarnivoro(String nome){
		super(nome, 20);
	}

	// METODI

	public boolean puoMangiare(Organismo organismo){
		if ( this.compareTo(organismo)==-1 && !(organismo instanceof Pianta))
			return true;
		else
			return false;
	}

}