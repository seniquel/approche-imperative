package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		/*
		Faire un programme avec le menu suivant :
			1. Ajouter un nombre
			2. Afficher les nombres existants.
		*/
		int[] table = new int[0];
		int choix;
		do {
			System.out.println("Choisissez une option:\n1. ajouter un nombre au tableau \n2. afficher le tableau\n3.fin");			
			choix = scanner.nextInt();
			switch(choix) {
			case 1:
				System.out.println("Saisissez le nombre à ajouter au tableau");
				int num = scanner.nextInt();
				table = agrandirTable(table, num);
				break;
			case 2:
				System.out.println("Contenu du tableau :");
				for (int i=0 ; i<table.length ; i++) {
					System.out.println(table[i]);
				}
				break;
			case 3:
				System.out.println("Fin du programme");
				break;
			default:
				System.out.println("Vous devez saisir 1, 2 ou 3");	
				break;
			}			
		}
		while (choix != 3);
		scanner.close();
		
	}
	static int[] agrandirTable(int[] table1, int num) {
		int[] table2 = new int[table1.length+1]; //la nouvelle table est plus grande de 1
		//on copie toutes les valeurs de la première table
		for (int i=0 ; i < table1.length ; i++) {
			table2[i] = table1[i];
		}
		table2[table2.length-1] = num; //on ajoute le nombre saisi à la fin du nouveau tableau
		return table2;
	}

}