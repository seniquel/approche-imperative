package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		int i;
		//Affichez tous les nombres de 1 à 10
		System.out.println("Tous les nombres de 1 à 10 :");
		for (i=1 ; i<=10 ; i++ ) {
			System.out.println(i);
		}
		
		//Affichez 20 fois votre nom et votre prénom
		System.out.println("Mon nom et prénom écrit 20 fois :");
		String nom = "SENIQUE Léo";
		for (i=0 ; i<20 ; i++) {
			System.out.println(nom);
		}
		
		//Affichez les éléments pairs de 2 à 100
		System.out.println("Tous les éléments pairs de 2 à 100 :");
		for (i=2 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//Affichez les éléments impairs de 1 à 99
		System.out.println("Tous les éléments impairs de 1 à 99");
		for (i=1 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
	}

}
