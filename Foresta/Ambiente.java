import java.io.*;
import java.util.*;

public class Ambiente{

	public static void catenaAlimentare(ArrayList<Organismo> organismi){

		boolean mangiato = false;

		for (int i=0; i<organismi.size(); i++) {

			Collections.sort(organismi);

			for (int z=0; z<organismi.size(); z++)
				System.out.println(organismi.get(z));

			for (int j=0; j<organismi.size(); j++) {
				if (!(organismi.get(i) instanceof Pianta) && organismi.get(j).isVivo()==true) {
					for (int k=0; k<organismi.size(); k++) {
						if (organismi.get(j).puoMangiare(organismi.get(k))==true &&  organismi.get(k).isVivo()==true) {
							organismi.get(j).mangia(organismi.get(k));
							mangiato = true;
							organismi.get(k).uccidi();
							break;
						} // if mangia 
					} // for k
					if (!mangiato)
						organismi.get(j).uccidi();
				} // if Pianta
			} // for j
		} // for i

	} // static

	public static void main (String arg[]){

		Scanner scanner = new Scanner(System.in);

		Organismo organismo;
		char scelta;
		String nome;
		ArrayList<Organismo> organismi = new ArrayList<Organismo>();
		
		do {
			System.out.print("Che organimso vuoi inserire? [P/C/E/F] ");
			scelta = scanner.nextLine().toUpperCase().charAt(0);

			switch(scelta){
				case 'P':
					organismi.add(new Pianta());
					break;
				case 'C':
					System.out.print("Che nome ha questo organismo? ");
					organismi.add(new AnimaleCarnivoro(scanner.nextLine()));
					break;
				case 'E':
					System.out.print("Che nome ha questo organismo? ");
					organismi.add(new AnimaleErbivoro(scanner.nextLine()));
					break;
				case 'F':
					break;
				default:
					System.out.print("Inserire [P/C/E/F] ! ");
					break;
			}

		} while(scelta!='F');

		catenaAlimentare(organismi);

	}
}