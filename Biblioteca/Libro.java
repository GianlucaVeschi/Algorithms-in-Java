public class Libro implements Comparable<Libro>{

	// CAMPI
	private int codice;
	private String autore, titolo;

	// COSTRUTTORI
	public Libro(String autore, String titolo, int codice){
		this.autore=autore;
		this.titolo=titolo;
		this.codice=codice;
	}

	// METODI
	public String getAutore(){
		return this.autore;
	}
	public String getTitolo(){
		return this.titolo;
	}
	public int getCodice(){
		return this.codice;
	}
	public String toString(){
		return "Autore: "+autore+" Titolo: "+titolo+" Codice: "+codice;
	}
	public int compareTo(Libro libro){
		return (this.codice<libro.codice) ? -1 : ((this.codice==libro.codice) ? 0 : 1 );
	}

}