package CP_TP7Exo3;

//la classe "principale" contenant la méthode main
public class CP_TP7Exo3
{
	public static void main(String args[])
	{
		//Création d'un nouvel objet de type "PMD_Public"
		//dont la référence est stockée dans la variable objet
		//(ou la variable de type classe) "premierPoint" créée à cet effet
		PMD_Public premierPoint = new PMD_Public();
		
		//Appel de la méthode afficher() pour l'objet
		//référencé par la variable objet "premierPoint"
		//Les champs ont été initialisés par défault
		System.out.println();
		System.out.println("L'objet premierPoint initial se présente : ");
		premierPoint.afficher();
		
		//Modification de la valeur du champ public "nomPoint" de l'objet 
		//référencé par la variable objet "premierPoint" 
		premierPoint.nomPoint = 'A';
		
		//Modification de la valeur du champ public "posX" de l'objet 
		//référencé par la variable objet "premierPoint"
		premierPoint.posX = 15.3;
		
		//Lecture de la valeur du champ public "nomPoint" de l'objet
		//référencé par la variable objet "premierPoint"
		System.out.println();
		System.out.println("Le nom du premierPoint est devenu : " + premierPoint.nomPoint + "."); 
		
		//Lecture de la valeur du champ public "posX" de l'objet
		//référencé par la variable objet "premierPoint"
		System.out.println();
		System.out.println("La position du premierPoint est devenue : " + premierPoint.posX + ".");		
		
		//Appel de la méthode afficher() pour l'objet référencé par la variable objet "premierPoint"
		System.out.println();
		System.out.println("L'objet premierPoint modifié se présente : ");
		premierPoint.afficher();
		
		//Création d'un nouvel objet de type "PMD_Private"
		//dont la référence est stockée dans la variable objet
		//(ou la variable classe) "deuxiemePoint" créée é cet effet
		PMD_Private deuxiemePoint = new PMD_Private();
		
		//Appel de la méthode afficher() pour l'objet référencé par la variable objet "deuxiemePoint"
		//Les champs ont été initialisés avec des valeurs précisées dans la classe
		System.out.println();
		System.out.println("L'objet deuxiemePoint initial se présente : ");		
		deuxiemePoint.afficher();
		
		//Modification de la valeur du champ privé "nomPoint" de l'objet
		//référencé par la variable objet "deuxiemePoint" 
		//deuxiemePoint.nomPoint = 'B';   faux
		deuxiemePoint.setNomPoint('B');
		
		//Modification de la valeur du champ privé "posX" de l'objet
		//référencé par la variable objet "deuxiemePoint"
		//deuxiemePoint.posX = 30.6;   faux
		deuxiemePoint.setPosX(30.6);
						
		//Lecture de la valeur du champ privé "nomPoint" de l'objet
		//référencé par la variable objet "deuxiemePoint"
		//System.out.println("Le nom du deuxiemePoint est : " + deuxiemePoint.nomPoint + ".");  faux
		System.out.println("\nLe nom du deuxiemePoint est devenu : " + deuxiemePoint.getNomPoint() + "."); 
		
		//Lecture de la valeur du champ privé "posX" de l'objet
		//référencé par la variable objet "deuxiemePoint"
		//System.out.println("La position du deuxiemePoint est : " + deuxiemePoint.posX + ".");  faux
		System.out.println("\nLa position du deuxiemePoint est devenue : " + deuxiemePoint.getPosX() + ".");		
		   	
		//Appel de la méthode afficher() pour l'objet
		//référencé par la variable objet "deuxiemePoint"
		System.out.println("\nL'objet deuxiemePoint modifié se présente : ");
		deuxiemePoint.afficher();
	}	//fin de la méthode main
}		//fin de la classe CP_TP7Exo3