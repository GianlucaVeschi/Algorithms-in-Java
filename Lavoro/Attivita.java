public abstract class Attivita implements Comparable<Attivita>{

	// CAMPI
	private int giorno;
	private int ora_inizio;
	private String nome_progetto;

	// COSTRUTTORI
	public Attivita(int giorno, int ora_inizio, String nome_progetto){
		this.giorno=giorno;
		this.ora_inizio=ora_inizio;
		this.nome_progetto=nome_progetto;
	}
	
	// METODI
	public int getGiorno(){
		return this.giorno;
	}
	public int getOraInizio(){
		return this.ora_inizio;
	}
	public String getNomeProgetto(){
		return this.nome_progetto;
	}
	public String toString(){
		return "Giorno: "+giorno+", ore "+ora_inizio;
	}
	public int compareTo(Attivita attivita){ // attivita in ordine cronologico
		if (this.giorno != attivita.giorno)
			return (this.giorno < attivita.giorno) ? -1 : 1;
		else
			return (this.ora_inizio < attivita.ora_inizio) ? -1 : 1;
	}

}