import java.util.*;

public class Giocatore{
	
	// CAMPI
	private String nome;
	private ArrayList<Carta> carte = new ArrayList<Carta>();

	// COSTRUTTORI
	public Giocatore(String nome){
		this.nome=nome;
	}

	// METODI
	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return nome;
	}

	public void prendi(Carta carta){
		carte.add(carta);
	}

	public String toString(){

		Collections.sort(carte);

		String s=nome+" ";
		for (int i=0; i<carte.size(); i++) {
			s+=carte.get(i)+" ";
		}
		return s;
	}

}