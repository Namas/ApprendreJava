package cms_tp2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import java.awt.Font;
import javax.swing.*;


public class CP_TP2Exo2 
{
	public static void main (String[] args)
	{
		//Déclaration var$
		Scanner scan = new Scanner(System.in);
		Calendar monCal =  new GregorianCalendar();
		int cetteAnnee = monCal.get(GregorianCalendar.YEAR);
		JFrame myFrame = new JFrame("(=.=)");
		Font fontPerso = new Font("Arial",Font.BOLD,24);
		//JLabel myLabel = new JLabel("(*^.^) (o o) ( Xx) (B B)");
		
		//Intro
		System.out.println("Bonjour ! Votre nom:");
		String nomUtilisateur = scan.next();
		System.out.println("Votre prénom:");
		String prenomUtilisateur = scan.next();
		System.out.println("Votre année de naissance:");
		int anneeUtilisateur = scan.nextInt();
		
		
		//Traitement
		int age = cetteAnnee-anneeUtilisateur;
		
		JLabel totoLabel = new JLabel("Bonjour "+nomUtilisateur+" "+prenomUtilisateur+", vous avez "+age+" ans.");
		myFrame.setBounds(500, 250, 750, 100);
		totoLabel.setFont(fontPerso);
		totoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myFrame.add(totoLabel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Affichage
		System.out.println("Bonjour "+nomUtilisateur + " " + prenomUtilisateur +",\nVous avez "+age+" ans.");
		myFrame.setVisible(true);
	}
}
