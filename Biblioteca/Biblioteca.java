public class Biblioteca{
	
	// CAMPI

	private ArrayList<Utente> utenti;
	private ArrayList<Libro> libri;
	private ArrayList<Prestito> prestiti;

	// COSTRUTTORI

	public Biblioteca(Utente utente, Libro libri, Prestito prestito){
		this.utente=new ArrayList<Utente>();
		this.libri=new ArrayList<Libro>();
		this.prestito=new ArrayList<Prestito>();
	}

	// METODI

	public void adUtente(Utente utente){
		utenti.add(utente);
	}
	public Utente getUtente(){
		return this.utente;
	}
	public void addLibro(Libro libro){
		libri.add(libro);
	}
	public Libro getLibro(){
		return this.libro;
	}
	public void addPrestito(){
		presenti.add(prestito);
	}
	public Prestito getPrestito(){
		return this.prestito;
	}

	public ArrayList<Libro> inventario(Date date){
		ArrayList<Libro> inventario = new ArrayList<Libro>();
		for (Libro libro : libri){
			for (Prestito prestito : prestiti) {
				if (libro.getCodice() == prestito.getLibro().getCodice() && !prestito.inPrestito(data))
					inventario.add(libro);
			}
		}		
		Collections.sort(inventario);
		return inventario;
	}

	public boolean inPrestito(Utente utente, Date giorno){
		if(giorno.compareTo(inizioPrestito)>=0 && giorno.compareTo(finePrestito)<=0 && utente.getCodice() == this.utente.getCodice())
			return true;
		else
			return false;
	}

	public String toString(){
		return "Utente: "+utete.toString()+" Libro: "+libro.toString()+" Prestito: "+prestito.toString();
	}

}