public abstract class Prodotto implements Comparable<Prodotto>{

	// CAMPI
	private int costo;
	private String nome;

	// COSTRUTTORI
	public Prodotto(int costo, String nome){
		this.costo=costo;
		this.nome=nome;
	}

	// METODI
	public int getCosto(){
		return this.costo;
	}
	public String getNome(){
		return this.nome;
	}
	public String toString(){
		return "Nome: "+nome+" Costo: "+costo;
	}
	public int compareTo(Prodotto prodotto){

		// se bevanda e merendina
		if (this instanceof Bevanda && prodotto instanceof Merendina)
			return -1; // vince this perche bevanda

		else if (this instanceof Merendina && prodotto instanceof Bevanda)
			return 1; // vince prodotto perche bevanda

		// se bevanda e bevanda
		else if (this instanceof Bevanda && prodotto instanceof Bevanda){
			Bevanda b1 = (Bevanda) this;
			Bevanda b2 = (Bevanda) prodotto;

			return ( b1.getCosto()<b2.getCosto() ? -1 : ( b1.getCosto()>b2.getCosto() ? 1 : ( b1.getVolume()>b2.getVolume() ? -1 : ( b1.getVolume()<b2.getVolume() ? 1 : 0 ))));
		}

		// merendina e merendina
		else { // (this instanceof Merendina && prodotto instanceof Merendina) {
			Merendina m1 = (Merendina) this;
			Merendina m2 = (Merendina) prodotto;

			return ( m1.getCosto()<m2.getCosto() ? -1 : ( m1.getCosto()>m2.getCosto() ? 1 : ( m1.getCalorie()<m2.getCalorie() ? -1 : ( m1.getCalorie()>m2.getCalorie() ? 1 : 0 ))));
		}
	}

}