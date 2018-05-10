import java.util.*;

public class Prestito{

	// CAMPI
	private Libro libro;
	private Date inizio, fine;
	private Utente utente;

	// COSTRUTTORI
	public Prestito (Libro libro, Date inizio, Date fine, Utente utente){
		this.libro=new Libro(Libro.getAutore(), Libro.getTitolo(), Libro.getCodice());
		this.inizio=inizio;
		this.fine=fine;
		this.utente=new Utente(Utente.getNome(), Utente.getCognome());
	}

	// METODI
	public Libro getLibro(){
		return this.libro;
	}
	public Date getDataInizio(){
		return this.inizio;
	}
	public Date getDataFine(){
		return this.fine;
	}
	public Utente getUtente(){
		return this.utente;
	}
	public String toString(){
		return "Libro: "+libro+" Data inizio: "+inizio+" Data fine: "+fine+" Utente: "+utente;
	}
	public boolean inPrestito(Date giorno){
		if (giorno.compareTo(this.inizio)>=0 && giorno.compareTo(this.fine)<=0)
			return true;
		else
			return false;
	}

}