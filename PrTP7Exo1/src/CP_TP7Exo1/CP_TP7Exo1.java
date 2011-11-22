package CP_TP7Exo1;

public class CP_TP7Exo1 {

	public static void main(String args[]) {
		System.out.println("Le plus grand nombre entier (long) vaut : " + Long.MAX_VALUE + ".");
		
		System.out.print("Le nombre reel (double) strictement positif le plus proche de zero vaut : "); 
		System.out.println(Double.MIN_VALUE + ".");			
		
		boolean varBool = true;
		System.out.println("La valeur de la variable varBool est : " + varBool + ".");
		
		float varReelle;
		varReelle = 0.001F;
		System.out.println("La valeur de la variable varReelle est : " + varReelle + ".");
		
		System.out.println("\nLa premiere ligne.\n\u0009La deuxieme ligne.\n\t\tLa troisieme ligne.\n");
		
		char varCar = 'A';
		System.out.println("La valeur initiale de varCar est : " + varCar + ".");
		varCar = 'Z';
		System.out.println("La valeur finale de varCar est : " + varCar + ".");
		
		System.out.println("\n3 a la puissance 4 vaut : " + Math.pow(3,4) + ".");
		
		System.out.println("\n23/5 vaut : " + 23/5 + ".");
		System.out.println("23.0/5.0 vaut : " + 23.0/5.0 + ".");
		System.out.println("23.0/5 vaut : " + 23.0/5 + ".");
		System.out.println("23/5.0 vaut : " + 23/5.0 + ".");
		
		//System.out.println("\n23/0 vaut : " + 23/0 + ".");	//Exception au runtime			
		System.out.println("-23/0.0 vaut : "+-23./0.0+".");
		System.out.println("0.0/0.0 vaut : " + 0.0/0.0 + ".");
		
		char varCar1 = 'A', varCar2 = 'a';
		System.out.println("\nLe code Unicode de A vaut : " + varCar1 + 0 + " ???");
		System.out.println("Le code Unicode de A vaut : " + (varCar1 + 0) + ".");
		System.out.println("'A' - 'a' vaut : " + (varCar1-varCar2) + ".");
		
		int i = 5, j = -12, k, n;
		k = i-- + ++j;
		System.out.println("\ni vaut " + i + ", j vaut " + j  + " et k vaut " + k + ".");	
		n = k <= j ? ++k : k-- ;
		System.out.println("\nn vaut " + n + " et k vaut " + k + ".");	
		
		//int ent1 = 3000000000;
		long ent1Prim = 3000000000L;
		
		int ent2 = 2000000000, ent3 = 1000000000, ent4;
		ent4 = ent2 + ent3;
		System.out.print("\nUn calcul surprenant : ");
		System.out.println(ent2 + " + " + ent3 + " = " + ent4 + " !");
		System.out.println("De m�me, ent1 apr�s le cast vaut " + ent1Prim + " !");
		
		short court1 = 32000;
		int court2 = 35000;
		System.out.println("\nUne valeur correcte : court1 = " + court1 + ".");
		System.out.println("Une valeur \"inattendue\" : court2 = " + court2 + " !");
		
		short court3 = 1000, court4 = 2000;
		short court5 = 0;
		court5 = (short)(court3 + court4);
		//court5 = (short)court3 + court4;
		System.out.println("\nUn calcul correct (gr�ce au cast) : " + court3 + " + " + court4 + " = " + court5 + ".");
							
	}
}
