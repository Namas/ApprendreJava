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
		String strNombre = Integer.toString(nbr);
		//Cr�er la variable "lon" de type int qui stocke la longueur de la cha�ne de caract�res "strNombre"
		int lon = strNombre.length();
		//Cr�er un compteur entier "i" initialis� � z�ro et qui sera utilis� dans la boucle do ci-dessous
		int i = 0;
		//Dans une boucle do, comparer chaque chiffre du deuxi�me argument ("le nombre") avec le premier argument ("la base")
		do
		{
			//Si le chiffre courant est plus grand ou �gal � la base
			if((strNombre.charAt(i)-48)>=base)
			{
				//Afficher un message d'erreur
				System.out.println("Err: nombre incompatible avec la base !");
				//Retourner la valeur bool�enne FAUX (et quitter le m�thode)
				return false;
			}
			//Incr�menter le compteur
			i++;
		//Continuer la boucle tant qu'il y a encore des chiffres � tester
		}while(i<lon);
		//Retourner la valeur bool�enne VRAI 
		//(car le programme arrive � ce point seulement si le couple "base et nombre" est valide)
		return true;
	}	//fin de la m�thode verifierBaseNombre

//************************************************************************************************************************	
//	D�finir une m�thode statique appel�e "calculerSomme" qui a trois arguments :
//    	- le premier argument "b" repr�sentant une base comprise entre 2 et 9 ;
//    	- les deux arguments suivants ("nb1" et "nb2") repr�sentant deux nombres entiers positifs exprim�s dans la base mentionn�e ;
// 	et qui :
//    	- si au moins un des trois arguments n'est pas valide, arr�te l'ex�cution du programme ;
//    	- dans les autres cas, retourne la somme des deux derniers arguments.
	
	//Pr�ciser l'en-t�te de la m�thode
	public static int calculerSomme(int base, int nbr1, int nbr2)
	{
	    //Utiliser la m�thode ad-hoc verifierBaseNombre d�finie ci-dessus afin de v�rifier 
	    // si le couple b et nb1 (i.e. la base et le premier terme de la somme � calculer) n'est pas valide
		if(!verifierBaseNombre(base, nbr1))
		{
			//Afficher un message d'erreur 
			System.out.println("Erreur nombre 1");
			//Quitter pr�matur�ment le programme
			System.exit(-1);
		}
	    //Utiliseer la m�thode ad-hoc verifierBaseNombre d�finie ci-dessus afin de v�rifier
		//si le couple b et nb2 (i.e. la base et le deuxi�me terme de la somme � calculer) n'est pas valide
		if(!verifierBaseNombre(base, nbr1))
		{
			//Afficher un message d'erreur
			System.out.println("Erreur nombre 1");
			//Quitter pr�matur�ment le programme
			System.exit(-2);
		}
		
	    //La partie qui suit s'ex�cute seulement si la base et les deux nombres � additionner sont valides
		
		//Cr�er la variable "strNb1" de type String qui correspond au deuxi�me argument transform� en cha�ne de caract�res
		String strNbr1 = Integer.toString(nbr1);
		//Cr�er la variable "lon1" de type int qui stocke la longueur de la cha�ne de caract�res "strNb1"
		int lon1 = strNbr1.length();
		//Cr�er la variable "strNb2" de type String qui correspond au troisi�me argument transform� en cha�ne de caract�res
		String strNbr2 = Integer.toString(nbr2);
		//Cr�er la variable "lon2" de type int qui stocke la longueur de la cha�ne de caract�res "strNb2"
		int lon2 = strNbr2.length();
		//Cr�er deux variables "chiffre1" et "chiffre2" de type int
		int chiffre1 = 0, chiffre2 = 0;
		//Cr�er la variable "ret" (pour la retenue) de type int et l'initialiser avec la valeur z�ro
		int ret = 0;
		//Cr�er un compteur entier "i" de type int et initialis� � 1
		int i = 1;
		//Cr�er une variable "strSomme" (pour la somme calcul�e) de type String et l'initiliser avec la cha�ne vide
		String strSomme="";
	    //Parcourir les deux nombres de la droite vers la gauche et additionner, pour chaque position,
	    //les chiffres correspondants et la retenue
		do
		{
			//Pr�ciser le chiffre courant du premier terme de la somme
			if(i <= lon1)
			{
				chiffre1 = strNbr1.charAt(lon1-i)-48;
			}else
			{
				chiffre1 = 0;
			}
			//Pr�ciser le chiffre courant du deuxi�me terme de la somme
			if(i<= lon2)
			{
				chiffre2 = strNbr2.charAt(lon2-i)-48;
			}else
			{
				chiffre2 = 0;
			}
			//Calculer le chiffre courant de la somme et le concatener � gauche de la cha�ne "strSomme"
			strSomme = (chiffre1+chiffre2+ret)%base+strSomme;
			//Calculer la nouvelle retenue
			ret = (chiffre1+chiffre2+ret)/base;
			//incr�menter le compteur d'une unit�
			i++;
		//Continuer la boucle tant qu'il y a encore des chiffres � additionner
		}while(i<=lon1||1<=lon2);
		//Si la derni�re retenue n'est pas nulle, concat�ner sa valeur � gauche de la cha�ne "strSomme"
		if(ret != 0)
		{
			strSomme = ret+strSomme;
		}
		//Cr��er la variable "somme" de type int qui correspond � la cha�ne "strSomme" transform�e en valeur enti�re
		int somme = Integer.parseInt(strSomme);
		//Retourner la valeur enti�re de la somme calcul�e
		return somme;
	}	//fin de la m�thode calculerSomme
/*
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
*/
}
















