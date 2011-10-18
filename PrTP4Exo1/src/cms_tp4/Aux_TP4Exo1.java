package cms_tp4;

public class Aux_TP4Exo1 
{
//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "verifierBaseNombre" qui a deux arguments :
//	    - le premier argument "base" repr�sentant une base comprise entre 2 et 9 ;
//	    - le deuxi�me argument "nombre" repr�sentant un nombre entier positif exprim� dans la base mentionn�e ;
//	 et qui retourne une valeur bool�enne :
//	    - FAUX si le premier argument est trop petit ou trop grand ou
//	           si un chiffre qui appara�t dans le deuxi�me argument est sup�rieur ou �gal � la base ;
//	    - VRAI dans les autres cas.	
	    
	//Pr�ciser l'en-t�te de la m�thode
	public static boolean verifierBaseNombre(int base, int nbr)
	{
	    //Si la base n'est pas comprise entre 2 et 9
		if((base<2)||(base>9))
		{
			//Afficher une message d'erreur
			System.out.println("Err: base non valide !");
			//Retourner la valeur bool�enne FAUX (et quitter la fonction)
			return	false;
		}
		
	    //La partie qui suit s'ex�cute seulement si la base est bien comprise entre 2 et 9
		
		//Cr�er la variable "strNombre" de type String qui correspond au deuxi�me argument transform� en cha�ne de caract�res
		
		//Cr�er la variable "lon" de type int qui stocke la longueur de la cha�ne de caract�res "strNombre"
		
		//Cr�er un compteur entier "i" initialis� � z�ro et qui sera utilis� dans la boucle do ci-dessous
		
		//Dans une boucle do, comparer chaque chiffre du deuxi�me argument ("le nombre") avec le premier argument ("la base")
		do
		{
			//Si le chiffre courant est plus grand ou �gal � la base
			if()
			{
				//Afficher un message d'erreur
				
				//Retourner la valeur bool�enne FAUX (et quitter le m�thode)
				
			}
			//Incr�menter le compteur
			
		//Continuer la boucle tant qu'il y a encore des chiffres � tester
		}while();
		//Retourner la valeur bool�enne VRAI 
		//(car le programme arrive � ce point seulement si le couple "base et nombre" est valide)
		
	}	//fin de la m�thode verifierBaseNombre

//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "calculerSomme" qui a trois arguments :
//    	- le premier argument "b" repr�sentant une base comprise entre 2 et 9 ;
//    	- les deux arguments suivants ("nb1" et "nb2") repr�sentant deux nombres entiers positifs exprim�s dans la base mentionn�e ;
// 	et qui :
//    	- si au moins un des trois arguments n'est pas valide, arr�te l'ex�cution du programme ;
//    	- dans les autres cas, retourne la somme des deux derniers arguments.
	
	//Pr�ciser l'en-t�te de la m�thode
	
	{
	    //Utiliser la m�thode ad-hoc verifierBaseNombre d�finie ci-dessus afin de v�rifier 
	    // si le couple b et nb1 (i.e. la base et le premier terme de la somme � calculer) n'est pas valide
		if()
		{
			//Afficher un message d'erreur 
			
			//Quitter pr�matur�ment le programme
			 
		}
	    //Utiliseer la m�thode ad-hoc verifierBaseNombre d�finie ci-dessus afin de v�rifier
		//si le couple b et nb2 (i.e. la base et le deuxi�me terme de la somme � calculer) n'est pas valide
		if()
		{
			//Afficher un message d'erreur
			
			//Quitter pr�matur�ment le programme
			 
		}
		
	    //La partie qui suit s'ex�cute seulement si la base et les deux nombres � additionner sont valides
		
		//Cr�er la variable "strNb1" de type String qui correspond au deuxi�me argument transform� en cha�ne de caract�res
		
		//Cr�er la variable "lon1" de type int qui stocke la longueur de la cha�ne de caract�res "strNb1"
		
		//Cr�er la variable "strNb2" de type String qui correspond au troisi�me argument transform� en cha�ne de caract�res
		
		//Cr�er la variable "lon2" de type int qui stocke la longueur de la cha�ne de caract�res "strNb2"
		
		//Cr�er deux variables "chiffre1" et "chiffre2" de type int
		
		//Cr�er la variable "ret" (pour la retenue) de type int et l'initialiser avec la valeur z�ro
		
		//Cr�er un compteur entier "i" de type int et initialis� � 1
		
		//Cr�er une variable "strSomme" (pour la somme calcul�e) de type String et l'initiliser avec la cha�ne vide
		
	    //Parcourir les deux nombres de la droite vers la gauche et additionner, pour chaque position,
	    //les chiffres correspondants et la retenue
		do
		{
			//Pr�ciser le chiffre courant du premier terme de la somme
			if()
			{
				
			}else
			{
				
			}
			//Pr�ciser le chiffre courant du deuxi�me terme de la somme
			if()
			{
				
			}else
			{
				
			}
			//Calculer le chiffre courant de la somme et le concatener � gauche de la cha�ne "strSomme"
			
			//Calculer la nouvelle retenue
			
			//incr�menter le compteur d'une unit�
			
		//Continuer la boucle tant qu'il y a encore des chiffres � additionner
		}while();
		//Si la derni�re retenue n'est pas nulle, concat�ner sa valeur � gauche de la cha�ne "strSomme"
		if()
		{
			
		}
		//Cr��er la variable "somme" de type int qui correspond � la cha�ne "strSomme" transform�e en valeur enti�re
		
		//Retourner la valeur enti�re de la somme calcul�e
			
	}	//fin de la m�thode calculerSomme

//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "decToBase" qui a deux arguments :
//	    - le premier argument "nb" repr�sentant un nombre entier positif exprim� en base 10 ;
//	    - le deuxi�me argument "base" repr�sentant une base comprise entre 2 et 9 ;
//	 et qui :
//	    - si la base n'est pas valide, arr�te l'ex�cution du programme ;
//   	- dans les autres cas, retourne la valeur du deuxi�me argument exprim�e dans la base mentionn�e.
	

//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "baseToDec" qui a deux arguments :
//	    - le premier argument "base" repr�sentant une base comprise entre 2 et 9 ;
//	    - le deuxi�me argument "nb" repr�sentant un nombre entier positif exprim� dans la base mentionn�e ;
//	 et qui :
//	    - si au moins un des deux arguments n'est pas valide, arr�te l'ex�cution du programme ;
//	    - dans les autres cas, retourne la valeur du deuxi�me argument en base 10.	

	
//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "base1ToBase2" qui a trois arguments :
//	    - le premier argument "base1" repr�sentant une "ancienne" base comprise entre 2 et 9 ;
//	    - le deuxi�me argument "nb" repr�sentant un nombre entier positif exprim� dans l'"ancienne" base ; 
//	    - le troisi�me argument "base2" repr�sentant une "nouvelle" base comprise entre 2 et 9 ;
//	 et qui :
//	    - si au moins un des trois arguments n'est pas valide, arr�te l'ex�cution du programme ;
//	    - dans les autres cas, retourne la valeur du deuxi�me argument exprim�e dans la "nouvelle" base.

	
//************************************************************************************************************************

}
















