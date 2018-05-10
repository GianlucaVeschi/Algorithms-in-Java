import java.util.*;

public class Riunione extends Attivita implements Comparable<Attivita>{

	// CAMPI
	private ArrayList<String> lista;

	// COSTRUTTORI
	public Riunione(int giorno, int ora_inizio, String nome_progetto, ArrayList<String> partecipanti){
		super(giorno, ora_inizio, nome_progetto);
		this.lista=partecipanti;
	}

	// METODI
	public ArrayList<String> getLista(){
		return this.lista;
	}
	
	public String toString(){
		return super.toString() + " incontro su progetto "+this.getNomeProgetto();
	}

	public boolean inRiunione(String persona){
		for (String partecipante : lista)
			if (partecipante.equals(persona))
				return true;
		return false;
	}

}