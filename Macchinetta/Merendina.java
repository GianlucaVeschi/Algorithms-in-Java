public class Merendina extends Prodotto{

	// CAMPI
	private int calorie;

	// COSTRUTTORI
	public Merendina(int costo, String nome, int calorie){
		super(costo, nome);
		this.calorie=calorie;
	}

	// METODI
	public int getCalorie(){
		return this.calorie;
	}
	public String toString(){
		return "Nome: "+getNome()+" Costo: "+getCosto()+" Calorie: "+calorie;
	}

}