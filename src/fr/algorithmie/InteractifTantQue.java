package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
		compris entre 1 et 10 :
		- Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
		nombre à l’utilisateur.
		- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
		*/
		int nb = 0;
		do {
			System.out.println("Saisissez un nombre entre 1 et 10");
			nb = scanner.nextInt();
		}
		while(nb < 1 || nb > 10);
		System.out.println("Le nombre saisi est "+nb);
		scanner.close();
	}
}
