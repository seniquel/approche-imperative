package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		//D�clarez un tableau d�entiers contenant tous les entiers de 1 � 10
		int tab[] = {1,2,3,4,5,6,7,8,9,10};
		
		//Affichez le premier �l�ment du tableau
		System.out.println("premier �l�ment du tableau: "+tab[0]);
		
		//Affichez la longueur du tableau en utilisant la propri�t� length
		System.out.println("longueur du tableau : "+tab.length);
		
		//Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
		System.out.println("dernier �l�ment du tableau : "+tab[tab.length-1]);
		
		//Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8
		tab[4] = 8;
		System.out.println("�l�ment 4 du tableau : "+tab[4]);
	}
}
