package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		//on déclare un tableau d’entiers
		int[] array = {0, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ;
		
		/*
		On calcule une valeur booléenne qui contrôle le tableau de la sorte :
			o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
			dernier élément vaut 6.
			o elle vaut false dans les autres cas
		écrire l’algo de valorisation de cette variable avec le minimum de ligne
		*/
		
		//en une ligne :
		boolean val =  (array.length >= 1) && (array[0]==6 || array[array.length-1]==6);

		System.out.println(val);

	}

}
