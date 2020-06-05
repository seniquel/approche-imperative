package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//exo 1
		int i;
		System.out.println("l’ensemble des éléments du tableau :");
		for (i=0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}

		//exo 2
		System.out.println("l’ensemble des éléments du tableau dans l'ordre inverse :");
		System.out.println("méthode 1 :");
		for (i=array.length-1 ; i>=0 ; i--) {
			System.out.println(array[i]);
		}
		System.out.println("méthode 2 :");
		for (i=0 ; i<array.length ; i++) {
			System.out.println(array[array.length-i-1]);
		}
	
		//exo 3
		System.out.println("Entiers supérieurs à 3 :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		//exo 4
		System.out.println("Entiers pairs :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		//exo 5
		System.out.println("Entiers d'index pair :");
		for (i=0 ; i<array.length ; i++) {
			if (i % 2 == 0) {
				System.out.println("index "+i+" : "+array[i]);
			}
		}
		//exo 6 
		System.out.println("Entiers impairs :");
		for (i=0 ; i<array.length ; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
	}
}
