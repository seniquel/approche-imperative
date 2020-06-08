package fr.algorithmie;
import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		Random rd = new Random();
		int batons = 21;
		int choix,coup;
		boolean tourOrdi=true;
		//sélection du premier joueur
		do {
			System.out.println("Veuillez sélectionnez qui commence :\n1.Joueur\n2.Ordinateur\n3.Aléatoire");
			choix = scanner.nextInt();
			switch(choix) {
			case(1):
				tourOrdi = false;
				break;
			case(2):
				tourOrdi = true;
				break;
			case(3):
				tourOrdi = rd.nextBoolean();
				break;
			default:
				System.out.println("Veuillez saisir un nombre entre 1 et 3");
				break;
			}
		}
		while(choix < 1 || choix > 3);
		
		System.out.println( (tourOrdi)? "L'ordinateur commence" : "Vous commencez" );
		
		while(batons > 0) {
			System.out.println("Il y a "+batons+" bâtons.");
			for (int i=0 ; i < batons ; i++) {
				System.out.print("|");
			}
			System.out.println("("+batons+")");
			if (tourOrdi) {
				//l'ordinateur joue le coup gagnant batons%5 si il peut, autrement il joue un coup aléatoire entre 1 et 4
				coup = (batons % 5 > 0)? batons % 5 : rd.nextInt(4) + 1;
				System.out.println("L'ordinateur retire "+coup+" bâtons");
				batons -= coup;
			}
			else {
				do {
					System.out.println("Enlevez entre 1 et 4 bâtons");
					coup = scanner.nextInt();
				}
				while(coup < 1 || coup > 4);
				System.out.println("Vous retirez "+coup+" bâtons");
				batons -=  coup;
			}
			tourOrdi = !tourOrdi; //on change de joueur
		}
		System.out.println( (tourOrdi)? "Vous avez gagné !" : "Vous avez perdu !" );
		scanner.close();
	}
}
