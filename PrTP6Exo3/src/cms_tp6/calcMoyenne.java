package cms_tp6;

import java.util.Scanner;

public class calcMoyenne 
{
	public static void main(String[] args) 
	{
		boolean fini = true;
		int notes[] = new int[100];
		int i = 0, nbrsNotes = 0, noteMax = 6, noteMin = -1;
		double moy = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		
		//enr nombres
		i = 0;
		while(i<100&&fini)//tant que maximum pas atteint, ou l'utilisateur a fini.
		{
			do
			{
				fini = false;
				System.out.println("Introduiser une note (-1 pour terminer):");
				notes[i] = sc.nextInt();
				if(notes[i]<noteMin||notes[i]>noteMax)//si val non autorisée
				{
					fini = true;
					System.out.println("Err: Une note entre 0 et 6 svp.");
				} // on redemande la valeur
			}while(fini); //val autorisée
			fini = true;
			
			if(notes[i]==-1) //si on veut quitter 
			{
				fini = false;
			}
			else //sinon 
			{
				moy += (double)notes[i];
				i++;
			}
			
		}
		nbrsNotes = i;
		moy /= nbrsNotes;
		
		
		System.out.println("Nbr notes introduites: "+nbrsNotes);
		System.out.println("Moyenne: "+moy);
		System.out.println("Adieu.");
		
	}
}
