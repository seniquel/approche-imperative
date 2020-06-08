package fr.algorithmie;

public class FistLast {

	public static void main(String[] args) {
		
		int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ;
		
		/*
		On calcule une valeur booléenne qui contrôle le tableau de la sorte :
			o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
			premier et le dernier élément du tableau ont la même valeur
			o elle vaut false dans les autres cas
		écrire l’algo de valorisation de cette variable avec le minimum de ligne
		*/
		
		boolean val =  (array.length >= 1) && (array[0]==array[array.length-1]);

		System.out.println(val);

	}

}
