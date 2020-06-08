package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
		ces nombres.
		*/
		System.out.println("Saisissez le nombre n°1");
		int max = scanner.nextInt();
		for (int i=1 ; i < 10 ; i++) {
			System.out.println("Saisissez le nombre n°"+(i+1));
			int num = scanner.nextInt();
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Le nombre le plus grand est "+max);
		scanner.close();

	}

}
