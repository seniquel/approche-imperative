package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		//Implémenter la méthode de tri à bulles
		int temp;
		for (int i=0 ; i < array2.length ; i++) {
			for (int j=0 ; j < array2.length-i-1 ; j++) {
				if (array2[j] > array2[j+1]) {
					//échange des valeurs avec une variable temporaire
					temp = array2[j];
					array2[j]=array2[j+1];
					array2[j+1]=temp;					
				}
			}
		}
		
		System.out.println("Tableau trié:");
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.println(array2[i]);
		}

	
	}

}
