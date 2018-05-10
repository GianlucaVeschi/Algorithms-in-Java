import java.io.*;
import java.util.*;

public class Test{

	public static void main (String arg[]){

		Scanner scanner = new Scanner(System.in);

		int seme, valore;

		do {

			do {
				System.out.print("Inserisci seme [0C 1Q 2F 3P]: ");
				seme = scanner.nextInt();
				scanner.nextLine();
			} while (seme<0 || seme>3);

			do {
				System.out.print("Inserisci valore: ");
				valore = scanner.nextInt();
				scanner.nextLine();
			} while (valore<0 || valore >13);

			Carta carta = new Carta(seme, valore);

			System.out.println(carta);

		} while (scanner.hasNext()); // <-- sbagliato

	}
}