public abstract class Organismo implements Comparable<Organismo>{

	// ATTRIBUTI

	private String nome;
	private double peso;
	private boolean vivo;

	// COSTRUTTORI

	public Organismo (String nome, double peso){
		this.nome=nome;
		this.peso=peso;
		this.vivo=true;
	}

	// METODI ASTRATTI

	public abstract boolean puoMangiare(Organismo cibo);

	// METODI CONCRETI

	public String toString(){
		return nome + " ("+peso+" kg)";
	}

	public double getPeso(){
		return peso;
	}

	public boolean isVivo(){
		return vivo;
	}

	public void uccidi(){
		vivo=false;
	}

	public boolean mangia(Organismo organismo){
		if (puoMangiare(organismo)) {
			this.peso+=(organismo.peso*0.9);
			organismo.uccidi();
			System.out.println(this.toString()+" ha mangiato "+organismo.toString());
			return true;
		}
		else
			return false;
	}

	public int compareTo(Organismo organismo){
		return this.peso<organismo.peso ? 1: (this.peso==organismo.peso ? 0 : -1);
	}

}