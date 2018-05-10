import java.io.*;
import java.util.*;

public class Test{
	public static void main(String arg[]){

	Scanner scanner = new Scanner(System.in);

	int ore, minuti, formato;
	Orario orario;
	boolean formato24;

	do {
		System.out.print("Inserisci le ore: ");
		ore = scanner.nextInt();
	} while (ore<0 || ore>23);

	do {
		System.out.print("Inserisci i minuti: ");
		minuti = scanner.nextInt();
	} while (minuti<0 || minuti>59);

	if (ore!=minuti && ore!=0 && minuti!=0)
		orario = new Orario(ore, minuti);
	else if (ore==minuti && ore!=0)
		orario = new Orario(ore);
	else
		orario = new Orario();

	Orario neworario = new Orario(12, 34);

	System.out.println(orario);

	System.out.println(orario.equals(neworario));

	}
}