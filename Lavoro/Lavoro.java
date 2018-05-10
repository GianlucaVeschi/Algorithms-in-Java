public class Lavoro extends Attivita implements Comparable<Attivita>{

	// CAMPI

	// COSTRUTTORI
	public Lavoro(int giorno, int ora_inizio, String nome_progetto){
		super(giorno, ora_inizio, nome_progetto);
	}

	// METODI
	public String toString(){
		return super.toString() + " lavoro su progetto "+this.getNomeProgetto();
	}

}