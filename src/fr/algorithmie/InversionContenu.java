package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/*Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy mais
		dans l�ordre inverse. */
		int[] arrayCopy = new int[array.length];
		for (int i = 0 ; i < array.length ; i++) {
			arrayCopy[i] = array[array.length-i-1];
		}
		
		//Afficher l�ensemble des �l�ments des 2 tableaux
		System.out.println("�l�ments des deux tableaux:");
		System.out.println("array\tarrayCopy");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]+"\t"+arrayCopy[i]);
		}		
	}

}
