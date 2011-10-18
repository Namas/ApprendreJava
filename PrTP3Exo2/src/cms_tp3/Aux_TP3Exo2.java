package cms_tp3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


import java.awt.Font;
import javax.swing.*;



public class Aux_TP3Exo2 
{
	public static int calculerAge(int anUtilisateur) 
	{
		Calendar monCal =  new GregorianCalendar();
		int cetteAnnee, age;
		
		cetteAnnee = monCal.get(GregorianCalendar.YEAR);
		
		if(anUtilisateur<=1800 || anUtilisateur > cetteAnnee)
		{
			System.out.println("Année de naissance non valide !");
			System.out.println("L'âge aura la valeur spécial -1 !");
			
			return -1;
		}
		
		age = cetteAnnee-anUtilisateur;
		
		return age;
	}
	
	public static void affFenetre(String nomUtilisateur, String prenomUtilisateur, int age) 
	{
		JFrame myFrame = new JFrame("(=.=)");
		Font fontPerso = new Font("Arial",Font.BOLD,24);

		JLabel totoLabel = new JLabel("Bonjour "+nomUtilisateur+" "+prenomUtilisateur+", vous avez "+age+" ans.");
		myFrame.setBounds(500, 250, 750, 100);
		totoLabel.setFont(fontPerso);
		totoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myFrame.add(totoLabel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
		
	}
	
}
