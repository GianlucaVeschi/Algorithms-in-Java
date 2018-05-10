public class GiocatoreEsperto extends Giocatore{

	// CAMPI
	private String nome;

	// COSTRUTTORI
	public GiocatoreEsperto(String nome){
		super(nome);
	}

	// METODI
	private static int intLog2(int k) {
		int parteIntera = (int) (Math.log10(k)/ Math.log10(2));
		return parteIntera;	
	}
	public int muovi(MucchioBiglie mucchio) {

		int n = mucchio.getMucchio();
		int m = n - ((int) (Math.pow(2,intLog2(n))) -1);	

		mucchio.prelevaBiglie(m);

		if(m >= 1 && m <= n/2)
			return m;
		return n/2;
		
	}

}