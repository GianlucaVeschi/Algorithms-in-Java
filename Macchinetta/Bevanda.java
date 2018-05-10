public class Bevanda extends Prodotto{

	// CAMPI
	private int volume;

	// COSTRUTTORI
	public Bevanda(int costo, String nome, int volume){
		super(costo, nome);
		this.volume=volume;
	}

	// METODI
	public int getVolume(){
		return this.volume;
	}
	public String toString(){
		return "Nome: "+getNome()+" Costo: "+getCosto()+" Volume: "+volume;
	}

}