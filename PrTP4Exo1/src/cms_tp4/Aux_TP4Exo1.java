package cms_tp4;

public class Aux_TP4Exo1 
{
//************************************************************************************************************************	
//	Définir une méthode statique appelée "verifierBaseNombre" qui a deux arguments :
//	    - le premier argument "base" représentant une base comprise entre 2 et 9 ;
//	    - le deuxième argument "nombre" représentant un nombre entier positif exprimé dans la base mentionnée ;
//	 et qui retourne une valeur booléenne :
//	    - FAUX si le premier argument est trop petit ou trop grand ou
//	           si un chiffre qui apparaît dans le deuxième argument est supérieur ou égal à la base ;
//	    - VRAI dans les autres cas.	
	    
	//Préciser l'en-tête de la méthode
	
	{
	    //Si la base n'est pas comprise entre 2 et 9
		if()
		{
			//Afficher une message d'erreur
			
			//Retourner la valeur booléenne FAUX (et quitter la fonction)
			
		}
		
	    //La partie qui suit s'exécute seulement si la base est bien comprise entre 2 et 9
		
		//Créer la variable "strNombre" de type String qui correspond au deuxième argument transformé en chaîne de caractères
		
		//Créer la variable "lon" de type int qui stocke la longueur de la chaîne de caractères "strNombre"
		
		//Créer un compteur entier "i" initialisé à zéro et qui sera utilisé dans la boucle do ci-dessous
		
		//Dans une boucle do, comparer chaque chiffre du deuxième argument ("le nombre") avec le premier argument ("la base")
		do
		{
			//Si le chiffre courant est plus grand ou égal à la base
			if()
			{
				//Afficher un message d'erreur
				
				//Retourner la valeur booléenne FAUX (et quitter le méthode)
				
			}
			//Incrémenter le compteur
			
		//Continuer la boucle tant qu'il y a encore des chiffres à tester
		}while();
		//Retourner la valeur booléenne VRAI 
		//(car le programme arrive à ce point seulement si le couple "base et nombre" est valide)
		
	}	//fin de la méthode verifierBaseNombre

//************************************************************************************************************************	
//	Définir une méthode statique appelée "calculerSomme" qui a trois arguments :
//    	- le premier argument "b" représentant une base comprise entre 2 et 9 ;
//    	- les deux arguments suivants ("nb1" et "nb2") représentant deux nombres entiers positifs exprimés dans la base mentionnée ;
// 	et qui :
//    	- si au moins un des trois arguments n'est pas valide, arrête l'exécution du programme ;
//    	- dans les autres cas, retourne la somme des deux derniers arguments.
	
	//Préciser l'en-tête de la méthode
	
	{
	    //Utiliser la méthode ad-hoc verifierBaseNombre définie ci-dessus afin de vérifier 
	    // si le couple b et nb1 (i.e. la base et le premier terme de la somme à calculer) n'est pas valide
		if()
		{
			//Afficher un message d'erreur 
			
			//Quitter prématurément le programme
			 
		}
	    //Utiliseer la méthode ad-hoc verifierBaseNombre définie ci-dessus afin de vérifier
		//si le couple b et nb2 (i.e. la base et le deuxième terme de la somme à calculer) n'est pas valide
		if()
		{
			//Afficher un message d'erreur
			
			//Quitter prématurément le programme
			 
		}
		
	    //La partie qui suit s'exécute seulement si la base et les deux nombres à additionner sont valides
		
		//Créer la variable "strNb1" de type String qui correspond au deuxième argument transformé en chaîne de caractères
		
		//Créer la variable "lon1" de type int qui stocke la longueur de la chaîne de caractères "strNb1"
		
		//Créer la variable "strNb2" de type String qui correspond au troisième argument transformé en chaîne de caractères
		
		//Créer la variable "lon2" de type int qui stocke la longueur de la chaîne de caractères "strNb2"
		
		//Créer deux variables "chiffre1" et "chiffre2" de type int
		
		//Créer la variable "ret" (pour la retenue) de type int et l'initialiser avec la valeur zéro
		
		//Créer un compteur entier "i" de type int et initialisé à 1
		
		//Créer une variable "strSomme" (pour la somme calculée) de type String et l'initiliser avec la chaîne vide
		
	    //Parcourir les deux nombres de la droite vers la gauche et additionner, pour chaque position,
	    //les chiffres correspondants et la retenue
		do
		{
			//Préciser le chiffre courant du premier terme de la somme
			if()
			{
				
			}else
			{
				
			}
			//Préciser le chiffre courant du deuxième terme de la somme
			if()
			{
				
			}else
			{
				
			}
			//Calculer le chiffre courant de la somme et le concatener à gauche de la chaîne "strSomme"
			
			//Calculer la nouvelle retenue
			
			//incrémenter le compteur d'une unité
			
		//Continuer la boucle tant qu'il y a encore des chiffres à additionner
		}while();
		//Si la dernière retenue n'est pas nulle, concaténer sa valeur à gauche de la chaîne "strSomme"
		if()
		{
			
		}
		//Crééer la variable "somme" de type int qui correspond à la chaîne "strSomme" transformée en valeur entière
		
		//Retourner la valeur entière de la somme calculée
			
	}	//fin de la méthode calculerSomme

//************************************************************************************************************************	
//	Définir une méthode statique appelée "decToBase" qui a deux arguments :
//	    - le premier argument "nb" représentant un nombre entier positif exprimé en base 10 ;
//	    - le deuxième argument "base" représentant une base comprise entre 2 et 9 ;
//	 et qui :
//	    - si la base n'est pas valide, arrête l'exécution du programme ;
//   	- dans les autres cas, retourne la valeur du deuxième argument exprimée dans la base mentionnée.
	

//************************************************************************************************************************	
//	Définir une méthode statique appelée "baseToDec" qui a deux arguments :
//	    - le premier argument "base" représentant une base comprise entre 2 et 9 ;
//	    - le deuxième argument "nb" représentant un nombre entier positif exprimé dans la base mentionnée ;
//	 et qui :
//	    - si au moins un des deux arguments n'est pas valide, arrête l'exécution du programme ;
//	    - dans les autres cas, retourne la valeur du deuxième argument en base 10.	

	
//************************************************************************************************************************	
//	Définir une méthode statique appelée "base1ToBase2" qui a trois arguments :
//	    - le premier argument "base1" représentant une "ancienne" base comprise entre 2 et 9 ;
//	    - le deuxième argument "nb" représentant un nombre entier positif exprimé dans l'"ancienne" base ; 
//	    - le troisième argument "base2" représentant une "nouvelle" base comprise entre 2 et 9 ;
//	 et qui :
//	    - si au moins un des trois arguments n'est pas valide, arrête l'exécution du programme ;
//	    - dans les autres cas, retourne la valeur du deuxième argument exprimée dans la "nouvelle" base.

	
//************************************************************************************************************************

}
















