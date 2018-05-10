import java.util.*;

public class Es1{

	public static void main(String arg[]){

		Scanner in = new Scanner (System.in);

		ArrayList<Attivita> lavori = new ArrayList<Attivita>();
		ArrayList<Attivita> riunioni = new ArrayList<Attivita>();

		int giorno, ora_inizio;
		String nome_progetto;

		String t[];

		while(in.hasNext()){

			t=in.nextLine().split(",");

			switch(t[0].charAt(0)){

				case 'L':
					giorno = Integer.parseInt(t[1]);
					ora_inizio = Integer.parseInt(t[2]);
					nome_progetto = t[3];
					// int giorno, int ora_inizio, String nome_progetto
					lavori.add(new Lavoro(giorno, ora_inizio, nome_progetto));
					break;

				case 'R':
					ArrayList<String> partecipanti = new ArrayList<String>();
					giorno = Integer.parseInt(t[1]);
					ora_inizio = Integer.parseInt(t[2]);
					nome_progetto = t[3];
					for (int i=4; i<t.length; i++)
						partecipanti.add(t[i]);
					// int giorno, int ora_inizio, String nome_progetto, ArrayList<String> partecipanti
					riunioni.add(new Riunione(giorno, ora_inizio, nome_progetto, partecipanti));
					break;

				case 'P':
					if(t[0].charAt(1) == 'L'){ // lavori in ordine cronologico
						Collections.sort(lavori);
						for (Attivita lavoro : lavori)
							System.out.println(lavoro.toString());
					}
					if(t[0].charAt(1) == 'R'){ // riunioni in ordine cronologico
						Collections.sort(riunioni);
						for (Attivita riunione : riunioni)
							System.out.println(riunione.toString());
					}

			} // switch

		} // while

	} // main

} // class