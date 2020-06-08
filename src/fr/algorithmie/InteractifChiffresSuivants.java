package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres
		suivants.
		*/
		System.out.println("Veuillez saisir un nombre");
		int num = scanner.nextInt();
		
		for(int i = num+1 ; i <= num+10 ; i++) {
			System.out.println(i);
		}
		scanner.close();


	}

}
