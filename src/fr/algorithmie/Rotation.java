package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] array = {0,1,2,3,4,5,6};
		int temp;
		
		//Effectuez une rotation � droite des �l�ments.
		
		//on �change tour � tour chaque �l�ment avec le premier �l�ment de la liste
		for (int i=1 ; i < array.length ; i++) {
			temp = array[0];
			array[0] = array[i];
			array[i] = temp;
		}

		System.out.println("Tableau apr�s rotation:");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

}
