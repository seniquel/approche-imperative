package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		//Créer un tableau qui contient la somme des 2 précédents tableaux
		
		//création du tableau vide de la même taille que le plus grand des 2 tableaux
		int[] array3 = new int[Math.max(array1.length, array2.length)];

		for (int i = 0 ; i < array3.length ; i++) {
			//condition pour vérifier qu'on ne dépasse pas la taille d'un des deux tableaux
			if (i < array1.length && i < array2.length) {
				array3[i] = array1[i] + array2[i];
			}
			else {
				//array3 prend la valeur du tableau le plus long
				array3[i] = (array1.length>array2.length)?array1[i]:array2[i];
			}
		}

		System.out.println("Éléments des trois tableaux:");
		System.out.println("array1\tarray2\tarray3");
		for (int i = 0 ; i < array3.length ; i++) {
			//affichage du nombre seulement si l'index ne dépasse pas la taille du tableau
			System.out.print( ((i<array1.length)?array1[i]:"") +"\t");
			System.out.print( ((i<array2.length)?array2[i]:"") +"\t");
			System.out.println(array3[i]);
		}

	}

}
