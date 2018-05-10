import java.util.*;

public class Es2{

	public static void main (String arg[]){

		Scanner in = new Scanner(System.in);

		ArrayList<SchedaAttivita> schede = new ArrayList<SchedaAttivita>();

		int giorno, ora_inizio;
		String nome_progetto, nome_proprietario, partecipante;

		String[] t;

		while (in.hasNext()){
			t=in.nextLine().split(",");

			switch(t[0].charAt(0)){

				case 'C': // crea una nuova scheda con il nome fornito
					nome_proprietario = t[1];
					schede.add(new SchedaAttivita(nome_proprietario));
					break;

				case 'L': // aggiunge un lavoro alla scheda del presidente fornito
					nome_proprietario = t[1];
					giorno = Integer.parseInt(t[2]);
					ora_inizio = Integer.parseInt(t[3]);
					nome_progetto = t[4];

					for (SchedaAttivita sc : schede)
						if (sc.getNomeProprietario().equals(nome_proprietario))
							sc.aggiungi(new Lavoro(giorno, ora_inizio, nome_progetto));
					break;

				case 'R': // aggiunge una riunione alla scheda del president fornito
					
					nome_proprietario = t[1];
					giorno = Integer.parseInt(t[2]);
					ora_inizio = Integer.parseInt(t[3]);
					nome_progetto = t[4];

					for (SchedaAttivita sc : schede) {
						if (sc.getNomeProprietario().equals(nome_proprietario)) {
							ArrayList<String> partecipanti = new ArrayList<String>();
							for (int i=5; i<t.length; i++)
								partecipanti.add(t[i]);
							sc.aggiungi(new Riunione(giorno, ora_inizio, nome_progetto, partecipanti));
						}
					}
					break;

				case 'V':
					partecipante = t[1];

					for (SchedaAttivita sc : schede) {
						// le riunioni in cui si e' presidente non vanno prese in considerazione
						if (! sc.getNomeProprietario().equals(partecipante)) {
							int conta = 0;
							for (Riunione r : sc.getRiunioni())
								if (r.inRiunione(partecipante))
									conta++;
							System.out.println(partecipante + " partecipa a "+conta+" riunioni di "+sc.getNomeProprietario());	
						}
					}
					break;

			} // switch

		} // while


	}


}