package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		//Impl�menter la m�thode de tri � bulles
		int temp;
		for (int i=0 ; i < array2.length ; i++) {
			for (int j=0 ; j < array2.length-i-1 ; j++) {
				if (array2[j] > array2[j+1]) {
					//�change des valeurs avec une variable temporaire
					temp = array2[j];
					array2[j]=array2[j+1];
					array2[j+1]=temp;					
				}
			}
		}
		
		System.out.println("Tableau tri�:");
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.println(array2[i]);
		}

	
	}

}
