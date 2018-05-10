public class Carta implements Comparable<Carta>{
	
	// CAMPI

	private int seme, valore;

	// COSTRUTTORI

	public Carta (int seme, int valore){
		this.seme=seme; // 0 cuori 1 quadri 2 fiori 3 picche
		this.valore=valore; // asso, re, donna, jack, 10 ... 2
	}

	//METODI

	public void setSeme(int seme){
		this.seme=seme;
	}

	public void setValore(int valore){
		this.valore=valore;
	}

	public char getSeme(){
		return trasformoSeme(seme);
	}

	public int getValore(){
		return valore;
	}

	public boolean equals(Carta o){
			return (this.seme==o.seme && this.valore==o.valore) ? true : false;
	}

	// confronto delle carte: prima per seme poi per valore. -1 minore, 0 uguale, 1 grande
	public int compareTo(Carta x){

		if (this.seme<x.seme) {
			return 1;

		} else if (this.seme>x.seme) {
			return -1;

		} else { // this.seme==this.valore

			if (this.valore==x.valore) {
				return 0;
			} else if ( (this.valore==1 && x.valore!=0) || (this.valore>x.valore) ) {
				return 1;
			} else {
				return -1;
			}

		} // else

	}

	public String toString(){
		if (valore==1 || valore > 9)
			return " "+trasformoValore(valore)+" "+trasformoSeme(seme);
		else if (valore == 10)
			return trasformoValore(valore)+" "+trasformoSeme(seme);
		else
			return " "+valore+" "+trasformoSeme(seme);
	}

	public static char trasformoSeme(int seme){
		switch(seme){
			case 0:
				return 9829; // cuori
			case 1:
				return 9830; // quadri
			case 2:
				return 9827; // fiori
			case 3:
				return 9824; // picche
			default:
				return 9829;
		}
	}

	public static char trasformoValore(int valore){
		switch(valore){
			case 1:
				return 'A';
			case 13:
				return 'K';
			case 12:
				return 'Q';
			case 11:
				return 'J';
			default:
				return 'A';
		}
	}

}