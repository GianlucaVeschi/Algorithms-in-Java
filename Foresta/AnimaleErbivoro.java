public class AnimaleErbivoro extends Organismo{

	// COSTRUTTORI

	public AnimaleErbivoro(String nome){
		super(nome, 10);
	}

	// METODI

	public boolean puoMangiare(Organismo organismo){
		if (organismo instanceof Pianta)
			return true;
		else
			return false;
	}

}