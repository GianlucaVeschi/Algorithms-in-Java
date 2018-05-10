import java.util.*;

public class Es1{

	public static void main (String arg[]){

		Scanner in = new Scanner (System.in);

		int soldi = 0;
		String nome; 
		int costo, volume, calorie;
		Prodotto prodotto;
		Macchinetta macchinetta = new Macchinetta(prodotti);
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

		String[] t;

		while (in.hasNext()){

			t=in.nextLine().split(" ");

			switch(t[0].charAt(0)){

				case 'B':
					nome = t[1];
					costo = Integer.parseInt(t[2]);
					volume = Integer.parseInt(t[3]);

					// int costo, String nome, int volume
					prodotto = new Bevanda (costo, nome, volume);
					prodotti.add(prodotto);
					break;

				case 'M':
					nome = t[1];
					costo = Integer.parseInt(t[2]);
					calorie = Integer.parseInt(t[3]);

					// int costo, String nome, int calorie
					prodotto = new Merendina (costo, nome, calorie);
					prodotti.add(prodotto);
					break;

				case 'S':
					int newsoldi = Integer.parseInt(t[1]);
					soldi+=newsoldi;
					break;

				case 'C':

					if (t[0].charAt(1) == 'M'){ // compraMerendina

						Prodotto merendina = macchinetta.compraMerendina(soldi);
						if ( merendina == null ) break;
						soldi-=merendina.getCosto();
						System.out.println("Ho mangiato: "+merendina.getNome());

					}

					if ((t[0].charAt(1) == 'B')){ // compraBevanda

						int volume_inserito = Integer.parseInt(t[1]);
						Prodotto bevanda = macchinetta.compraBevanda(soldi, volume_inserito);
						if ( bevanda == null ) break;
						soldi-=bevanda.getCosto();
						System.out.println("Ho bevuto: "+bevanda.getNome());

					}

			} // switch

		} // while

	} // main

} // class