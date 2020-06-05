package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		//exo 1
		int tab[] = {1,2,3,4,5,6,7,8,9,10};
		
		//exo 2
		System.out.println("premier élément du tableau: "+tab[0]);
		
		//exo 3
		System.out.println("longueur du tableau : "+tab.length);
		
		//exo 4
		System.out.println("dernier élément du tableau : "+tab[tab.length-1]);
		
		//exo 5
		tab[4] = 8;
		System.out.println("élément 4 du tableau : "+tab[4]);
	}
}
