public abstract class Giocatore{

	// CAMPI
	private String nome;

	// COSTRUTTORI
	public Giocatore(String nome){
		this.nome=nome;
	}

	// METODI
	public abstract int muovi(MucchioBiglie mucchio);
	
	public String getNome(){
		return this.nome;
	}

}