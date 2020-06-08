package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
		10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
		multiplication de ce nombre.		
		*/
		int nb = 0;
		do {
			System.out.println("Saisissez un nombre entre 1 et 10");
			nb = scanner.nextInt();
		}
		while(nb < 1 || nb > 10);
		
		//affichage de la table de multiplication de 1 à 10
		System.out.println("Table de "+nb);
		for (int i=1 ; i <= 10 ; i++) {
			System.out.println(nb+" * "+i+" = "+nb*i);
		}
		scanner.close();
	}

}
