package cms_tp6;

import java.util.*;

public class minMax 
{
	public static void main(String[] args) 
	{
		boolean fini = true;
		int suiteNbr[] = new int[100];
		int i = 0, nbrsEntiers = 0, nbrMax = -2147483648, nbrMin = 2147483647;
		char repUser = '\0';
		
		Scanner sc = new Scanner(System.in);
		
		
		//enr nombres
		i = 0;
		while(i<100&&fini)//tant que maximum pas atteint, ou l'utilisateur a fini.
		{
			System.out.println("Introduiser un nombre entier:");
			suiteNbr[i] = sc.nextInt();
			if(nbrMax<suiteNbr[i])
			{
				nbrMax = suiteNbr[i];
			}
			if(nbrMin>suiteNbr[i])
			{
				nbrMin = suiteNbr[i];
			}
			System.out.println("Voulez-vous continuez? (O/n)");
			repUser = sc.next().charAt(0);
			if(repUser!='O'&&repUser!='o'&&repUser!='\n')
				fini = false;
			i++;
		}
		nbrsEntiers = i;
		
		System.out.println("Nbr val introduites: "+nbrsEntiers);
		System.out.println("max: "+nbrMax);
		System.out.println("min: "+nbrMin);
		System.out.println("Adieu.");
		
	}
	
}
