import java.io.*;
import java.util.*;

public class Life{

	public static void visualizza(boolean[][] matrice){
		for (int i=0; i<matrice.length; i++) { // righe n
			for (int j=0; j<matrice.length; j++) { // colonne m
				if (matrice[i][j]==true)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println("\033[H"); // sposto il cursore in alto a sx
	}

	public static boolean[][] vita(boolean[][] matrice){

		int n=matrice.length;
		int m=matrice.length;
		int cellevive;

		for (int i=0; i<n; i++) { // righe n

			for (int j=0; j<m; j++) { // colonne m

				cellevive=0;

				if(matrice[(i+1) % n][j])
					cellevive++;
			    if(matrice[(i+n-1) % n][j])
			    	cellevive++;
			    if (matrice[i][(j+1) % m])
			    	cellevive++;
			    if (matrice[i][(j+m-1) % m])
			    	cellevive++;
			    if (matrice[(i+1) % n][(j+1) % m])
			    	cellevive++;
			    if (matrice[(i+n-1) % n][(j+1) % m])
			    	cellevive++;
			    if (matrice[(i+1) % n][(j+m-1) % m])
			    	cellevive++;
			    if (matrice[(i+n-1) % n][(j+m-1) % m])
			    	cellevive++;

			    if (matrice[i][j]==true) { // se viva
			    	if (cellevive==2 || cellevive==3)
			    		matrice[i][j]=true;
			    	else
			    		matrice[i][j]=false;
			    } else { // se morta
			    	if (cellevive==3)
			    		matrice[i][j]=true;
			    	else
			    		matrice[i][j]=false;
			    } // else

			} // for j

		} // for i

		return matrice;

	} // static

	public static void main (String arg[]) throws Exception{

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(arg[0]);
		int m = Integer.parseInt(arg[1]);
		double p = Double.parseDouble(arg[2]);

		boolean[][] matrice = new boolean[n][m];

		for (int i=0; i<n; i++) // righe n
			for (int j=0; j<m; j++) // colonne m
				matrice[i][j] = (Math.random() < p) ? true : false;

		visualizza(matrice);
		System.out.println("\033[H\033[2J"); // pulisco lo schermo

		for (; ; ) {
			vita(matrice);			
			Thread.sleep(500);
			visualizza(matrice);
		}

	} // main

} // class