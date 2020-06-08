package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/*Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
		dans l’ordre inverse. */
		int[] arrayCopy = new int[array.length];
		for (int i = 0 ; i < array.length ; i++) {
			arrayCopy[i] = array[array.length-i-1];
		}
		
		//Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("Éléments des deux tableaux:");
		System.out.println("array\tarrayCopy");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]+"\t"+arrayCopy[i]);
		}		
	}

}
