package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		int i;
		System.out.println("l�ensemble des �l�ments du tableau :");
		for (i=0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}

		//Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		System.out.println("l�ensemble des �l�ments du tableau dans l'ordre inverse :");
		System.out.println("m�thode 1 :");
		for (i=array.length-1 ; i>=0 ; i--) {
			System.out.println(array[i]);
		}
		System.out.println("m�thode 2 :");
		for (i=0 ; i<array.length ; i++) {
			System.out.println(array[array.length-i-1]);
		}
	
		//Combiner une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3
		System.out.println("Entiers sup�rieurs � 3 :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		//Combiner une boucle et un test de mani�re � n�afficher que les entiers pairs
		System.out.println("Entiers pairs :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		//Combiner une boucle et un test de mani�re � n�afficher que valeurs des index pairs
		System.out.println("Entiers d'index pair :");
		for (i=0 ; i<array.length ; i++) {
			if (i % 2 == 0) {
				System.out.println("index "+i+" : "+array[i]);
			}
		}
		//Combiner une boucle et un test de mani�re � n�afficher que les entiers impairs
		System.out.println("Entiers impairs :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
	}
}
