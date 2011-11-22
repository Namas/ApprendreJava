package SdZTp1;

import java.util.Scanner;

public class conversionFarenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int tmpDep = 0, tmpArr = 0, pas = 0, i = 0, j = 0;
		int valTmpCelsius[] = new int[1000];
		int valTmpFarenheit[] = new int[1000];
		char rep = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plage de conversion degré celcius Farenheit (nbr entier)");//Intro
		
		while(rep!='n'&&rep!='N')
		{
			System.out.println("Temperature de départ:");//Demmande temperature départ
			tmpDep = sc.nextInt();
			System.out.println("Temperature d'arrivée:");//temperature arrivée
			tmpArr  = sc.nextInt();
			System.out.println("Pas (nbr entier):");//pas
			pas = sc.nextInt();
			
			while(tmpDep<tmpArr)
			{
				valTmpCelsius[i++] = tmpDep;
				tmpDep += pas;
				
			}
			
			for(j=0;j<i;j++)
			{
				valTmpFarenheit[j] = (int)(9/5*(double)valTmpCelsius[j]+32);//calculs F = 9/5 * C + 32
			}
			
			do
			{
				System.out.println("Voulez-vous affichez le tableau? (O/n)");
				rep = sc.next().charAt(0);
			}while(rep!='o'&&rep!='O');
			
			//Affichage
			System.out.println("----------------------------------");
			System.out.println("|   Celcius    |    Farenheit    |");
			System.out.println("----------------------------------");
			
			for(j=0;j<i;j++)
			{
				if(abs(valTmpCelsius[j])<10)
					System.out.print("|      ");
				else if(abs(valTmpCelsius[j])<100)
					System.out.print("|     ");
				else if(abs(valTmpCelsius[j])<1000)
					System.out.print("|    ");
				System.out.print(+valTmpCelsius[j]);
				System.out.print("       |");
				if(valTmpFarenheit[j]<10)
					System.out.print("         ");
				else if(valTmpFarenheit[j]<100)
					System.out.print("        ");
				else if(valTmpFarenheit[j]<1000)
					System.out.print("       ");
				else if(valTmpFarenheit[j]<10000)
					System.out.print("      ");
				System.out.print(valTmpFarenheit[j]);
				System.out.println("       |");
			}
			System.out.println("----------------------------------");
			
			System.out.println("Nouveau tableau? (O/n)");
			rep = sc.next().charAt(0);
		
		}
		System.out.println("Au revoir.");
		return;
	}
	private static int abs(int i) {
		if(i<0)
			i=-i;
		return i;
	}

}
