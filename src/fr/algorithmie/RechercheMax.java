package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Rechercher le plus grand �l�ment du tableau
		int max = array[0];
		for (int i = 0 ; i < array.length ; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Plus grand �l�ment du tableau : "+max);
		
	}

}
