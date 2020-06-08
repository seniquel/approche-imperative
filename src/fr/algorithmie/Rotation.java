package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] array = {0,1,2,3,4,5,6};
		int temp;
		
		//Effectuez une rotation à droite des éléments.
		
		//on échange tour à tour chaque élément avec le premier élément de la liste
		for (int i=1 ; i < array.length ; i++) {
			temp = array[0];
			array[0] = array[i];
			array[i] = temp;
		}

		System.out.println("Tableau après rotation:");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

}
