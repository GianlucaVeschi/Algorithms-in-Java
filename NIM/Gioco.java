public class Gioco{

	public static void main (String arg[]){

		GiocatoreEsperto player1 = new GiocatoreEsperto(arg[0]);
		GiocatoreEsperto player2 = new GiocatoreEsperto(arg[1]);
		MucchioBiglie mucchio = new MucchioBiglie(Integer.parseInt(arg[2]));
		int turno = Integer.parseInt(arg[3]);

		Giocatore vincitore = partita(player1, player2, mucchio.getMucchio(), turno);
		System.out.println("Il vincitore e': "+ vincitore.getNome());

	}

	private static Giocatore partita(Giocatore player1, Giocatore player2, int n, int turno) {

		MucchioBiglie mucchio = new MucchioBiglie(n);
		GiocatoreEsperto vincitore = new GiocatoreEsperto("");

		while(mucchio.getMucchio()>1) {

			System.out.println(mucchio.toString());

			if (turno<=0) {
				System.out.println("Tocca a "+player1.getNome());
				System.out.println("Tolgo "+player1.muovi(mucchio)+" biglie");
				turno=1;

				if(mucchio.getMucchio() == 1)
					vincitore = new GiocatoreEsperto(player2.getNome());

			} else {
				System.out.println("Tocca a "+player2.getNome());
				System.out.println("Tolgo "+player2.muovi(mucchio)+" biglie");
				turno=-1;

				if(mucchio.getMucchio() == 1)
					vincitore = new GiocatoreEsperto(player1.getNome());
			}

		} // while

		System.out.println("Partita conclusa!");
		return vincitore;

	}

}