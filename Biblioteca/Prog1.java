import java.util.*;

public class Prog1{

	public static Date convertiData(String s){

		String[] numeri = s.split("/");
		return new Date(Integer.parseInt(numeri[2])-1900, Integer.parseInt(numeri[1]), Integer.parseInt(numeri[0]));

	} // static

	public static void main (String arg[]){

		Scanner scanner = new Scanner(System.in);

		ArrayList<Utente> utenti = new ArrayList<Utente>();
		ArrayList<Libro> libri = new ArrayList<Libro>();
		ArrayList<Prestito> prestiti = new ArrayList<Prestito>();

		while (scanner.hasNextLine()){

			String[] frase = scanner.nextLine().split(",");

			switch(frase[0].charAt(0)){

				case 'U':
					// String nome, String cognome
					utenti.add(new Utente(frase[1], frase[2]));
					break;

				case 'L':
					// String autore, String titolo, int codice
					libri.add(new Libro(frase[1], frase[2], Integer.parseInt(frase[3])));
					break;

				case 'P':
					int codiceLibro = Integer.parseInt(arg[1]);
					int codiceUtente = Integer.parseInt(arg[2]);
					// Libro libro, Date inizio, Date fine, Utente utente
					prestiti.add(new Prestito(libri.get(codiceLibro),convertiData(frase[3]),convertiData(frase[4]),utenti.get(codiceUtente)));

				case 'D':
					ArrayList<Libro> libriInPrestito = new ArrayList<Libro>(); // creo un nuovo ArrayList di tipo Libro di tipo Prestito
					for (Prestito prestito : prestiti) // scorro ArrayList prestiti di tipo Prestito
						if(prestito.inPrestito(convertiData(arg[0]))) // se libro in prestito
							libriInPrestito.add(prestito.getLibro()); // aggiungo il libro dentro ArrayList libriInPrestito
					Collections.sort(libriInPrestito); // ordino ArrayList pieno di libri in prestito
					System.out.println( "In data " + frase[1] + ", i libri in prestito sono:" );
					for (int i=0; i<libriInPrestito.size(); i++)
						System.out.println(libriInPrestito.get(i));

			} // switch

		} // while

	} // main

} // class