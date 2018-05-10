public class Utente{

	// CAMPI
	private int codice;
	private int c=0;
	private String nome, cognome;

	// COSTRUTTORI
	public Utente(String nome, String cognome){
		this.nome=nome;
		this.cognome=cognome;
		this.codice=c;
		c++;
	}

	// METODI
	public String getNome(){
		return this.nome;
	}
	public String getCognome(){
		return this.cognome;
	}
	public int getCodice(){
		return this.codice;
	}
	public String toString(){
		return "Nome: "+nome+" Cognome: "+cognome+" Codice: "+codice;
	}

}