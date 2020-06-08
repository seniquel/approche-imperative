package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
		entiers compris entre 1 et ce nombre.
		*/
		System.out.println("Veuillez saisr un nombre");
		int num = scanner.nextInt();
		int somme = 0;
		
		//on prévoit le cas où le chiffre est négatif
		if(num >= 1) {
			for(int i=1 ; i <= num ; i++) {
				somme += i;
			}
		}
		else {
			for(int i=1 ; i >= num ; i--) {
				somme += i;
			}
		}
		System.out.println("Somme des entiers entre 1 et "+num+" : "+somme);
		scanner.close();
	}

}
