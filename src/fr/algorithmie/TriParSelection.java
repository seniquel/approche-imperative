package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		//Impl�menter la m�thode tri par s�lection
		int temp;
		
	
		for (int i=0 ; i < array2.length ; i++) {
			for (int j=i ; j < array2.length ; j++) {
				if (array2[i] > array2[j]) {
					//�change des valeurs avec une variable temporaire
					temp = array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
				}
			}
		}
		
		System.out.println("Tableau tri�:");
		for (int i = 0 ; i < array2.length ; i++) {
			System.out.println(array2[i]);
		}

	}

}
