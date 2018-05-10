import java.util.*;

public class SchedaAttivita{

	// CAMPI
	private ArrayList<Attivita> lista_attivita;
	private String nome_proprietario;

	// COSTRUTTORI
	public SchedaAttivita(ArrayList<Attivita> lista_attivita, String nome_proprietario){
		this.lista_attivita=lista_attivita;
		this.nome_proprietario=nome_proprietario;
	}

	public SchedaAttivita(String nome_proprietario){
		ArrayList<Attivita> att = new ArrayList<Attivita>();
		this.lista_attivita=att;
		this.nome_proprietario=nome_proprietario;
	}

	// METODI
	public String getNomeProprietario(){
		return this.nome_proprietario;
	}
	public ArrayList<Attivita> getListaAttivita(){
		return this.lista_attivita;
	}
	public ArrayList<Riunione> getRiunioni(){
		ArrayList<Riunione> riunioni = new ArrayList<Riunione>();
		for (Attivita attivita : lista_attivita){
			if (attivita instanceof Riunione){
				Riunione riunione = (Riunione) attivita;
				riunioni.add(riunione);
			}
		}
		return riunioni;
	}
	public void aggiungi (Attivita attivita){
		for (Attivita a : lista_attivita)
			if (a.getGiorno()==attivita.getGiorno()){
				if (a.getOraInizio()==attivita.getOraInizio()){}
			} else {
				lista_attivita.add(attivita);
			}
	}
	public int contaRiunioni(String name){
		int conta=0;
		for (Attivita a : lista_attivita)
			if (a instanceof Riunione)
				conta++;
		return conta;
	}

}