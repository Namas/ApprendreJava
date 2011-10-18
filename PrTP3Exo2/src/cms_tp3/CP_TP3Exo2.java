package cms_tp3;

import java.util.Scanner;




public class CP_TP3Exo2 
{
	public static void main (String[] args)
	{
		//Déclaration var
		int age;
		Scanner scan = new Scanner(System.in);

		//JLabel myLabel = new JLabel("(*^.^) (o o) ( Xx) (B B)");
		
		//Intro
		System.out.println("Bonjour ! Votre nom:");
		String nomUtilisateur = scan.next();
		System.out.println("Votre prénom:");
		String prenomUtilisateur = scan.next();
		System.out.println("Votre année de naissance:");
		int anneeUtilisateur = scan.nextInt();
		
		
		//Traitement
		
		
		age = Aux_TP3Exo2.calculerAge(anneeUtilisateur);
		
		//Affichage
		System.out.print("Bonjour "+nomUtilisateur + " " + prenomUtilisateur);
		if(age>0)
		{
			System.out.print(",\nVous avez "+age+" ans. \r");
			Aux_TP3Exo2.affFenetre(nomUtilisateur, prenomUtilisateur, age);
		}
		else
		{
			System.out.println("");
		}
		
		
	}
}
