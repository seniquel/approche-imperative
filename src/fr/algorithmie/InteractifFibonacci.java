package fr.algorithmie;
import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		//Demander à l’utilisateur de choisir un rang N
		System.out.println("Veuillez choisir un rang N");
		int N = scanner.nextInt();
		while(N<2) {
			System.out.println("N doit être supérieur ou égal à 2");
			N = scanner.nextInt();			
		}
		
		
		//Ecrire un algorithme qui calcule et affiche le nombre de rang N
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		
		for (int i=2 ; i <= N ; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println("Le nombre de Fibonacci de rang "+N+" est "+num3);
		scanner.close();
	}

}
