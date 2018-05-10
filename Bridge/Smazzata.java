import java.io.*;
import java.util.*;

public class Smazzata {

	public static void main (String arg[]){

		Giocatore[] giocatori = new Giocatore[4];
		ArrayList<Carta> mazzo = new ArrayList<Carta>();

		// creo 4 giocatori
		for (int i=0; i<4; i++)
			giocatori[i] = new Giocatore(arg[i]);

		// creo il mazzo ordinato
		for (int i=0; i<4; i++)
			for (int j=0; j<14; j++)
				mazzo.add(new Carta(i, j));

		System.out.println(mazzo);

		// disordino il mazzo
		Collections.shuffle(mazzo, new Random());

		System.out.println(mazzo);

		// do le carte ai giocatori
		for (int i=0; i<4; i++) {
			for (int j=0, k=i; j<13 && k<52; j++, k+=4) {
				giocatori[i].prendi(mazzo.get(k));
			}
			System.out.println(giocatori[i]);
		}

	}

}