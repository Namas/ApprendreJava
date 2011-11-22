package cms_tp6;

import java.util.*;

public class calculAireCylindre {
	
public static void main(String[] args) 
{
	boolean err = true;
	double r= 0, h = 0, aire = 0, volume = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bonjour ! Ce programme calule l'aire...");//message d'acceuil
	
	do
	{
		err=false;
		System.out.println("inserer la valeur du rayon:");
		r = sc.nextDouble();//val rayon
		
		if(r<0.0)//erreur
		{
			System.out.println("err: nbr négatif !");
			err = true;
		}

	}while(err);
	
	do
	{
		err=false;
		System.out.println("inserer la hauteur:");
		h = sc.nextDouble();//val hauteur	
		
		if(h<0.0)//erreur
		{
			System.out.println("err: nbr négatif !");
			err = true;
		}
	}while(err);
	
	
	//calculs
	
	aire = 2*Math.PI*r*h+2*Math.PI*r*r;//aire 2pi*r*h + 2pi*r²
	
	volume = Math.PI*r*r*h;//volume pi*r²*h
	
	System.out.println("Cylindre calculé,\naire: "+aire+" volume: "+volume);//affichage
	
	System.out.println("Au revoir.");//message de fin
}

}
