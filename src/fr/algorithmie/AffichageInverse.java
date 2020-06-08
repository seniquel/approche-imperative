package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		//Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		System.out.println("�l�ments du tableau :");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		//Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		System.out.println("�l�ments du tableau dans l'ordre inverse :");
		for (int i = array.length-1 ; i >= 0 ; i--) {
			System.out.println(array[i]);
			
		}
		//Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		int[] arrayCopy = new int[array.length];
		for (int i = 0 ; i < array.length ; i++) {
			arrayCopy[i] = array[i];
		}
		System.out.println("�l�ments du tableau copi� :");
		for (int i = 0 ; i < arrayCopy.length ; i++) {
			System.out.println(arrayCopy[i]);
		}
				
		
	}

}
;