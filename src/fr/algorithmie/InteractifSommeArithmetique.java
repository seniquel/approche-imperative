package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande un nombre � l�utilisateur puis calcule la somme de tous les
		entiers compris entre 1 et ce nombre.
		*/
		System.out.println("Veuillez saisr un nombre");
		int num = scanner.nextInt();
		int somme = 0;
		
		//on pr�voit le cas o� le chiffre est n�gatif
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
