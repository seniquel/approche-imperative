package fr.algorithmie;

public class FistLast {

	public static void main(String[] args) {
		
		int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ;
		
		/*
		On calcule une valeur bool�enne qui contr�le le tableau de la sorte :
			o elle vaut true si le tableau est de longueur sup�rieure ou �gale � 1 et que le
			premier et le dernier �l�ment du tableau ont la m�me valeur
			o elle vaut false dans les autres cas
		�crire l�algo de valorisation de cette variable avec le minimum de ligne
		*/
		
		boolean val =  (array.length >= 1) && (array[0]==array[array.length-1]);

		System.out.println(val);

	}

}
