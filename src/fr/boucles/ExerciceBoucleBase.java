package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		int i;
		//Affichez tous les nombres de 1 � 10
		System.out.println("Tous les nombres de 1 � 10 :");
		for (i=1 ; i<=10 ; i++ ) {
			System.out.println(i);
		}
		
		//Affichez 20 fois votre nom et votre pr�nom
		System.out.println("Mon nom et pr�nom �crit 20 fois :");
		String nom = "SENIQUE L�o";
		for (i=0 ; i<20 ; i++) {
			System.out.println(nom);
		}
		
		//Affichez les �l�ments pairs de 2 � 100
		System.out.println("Tous les �l�ments pairs de 2 � 100 :");
		for (i=2 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//Affichez les �l�ments impairs de 1 � 99
		System.out.println("Tous les �l�ments impairs de 1 � 99");
		for (i=1 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
	}

}
