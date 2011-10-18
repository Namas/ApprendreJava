package cms_tp4;

public class CP_TP4Exo1 
{
	public static void main(String[] args) 
	{
		//Tests pour la méthode verifierBaseNombre
		System.out.println(Aux_TP4Exo1.verifierBaseNombre(-1, 12002));
		System.out.println("-------------------------------------------------------------");
		System.out.println(Aux_TP4Exo1.verifierBaseNombre(11, 12002));
		System.out.println("-------------------------------------------------------------");
		System.out.println(Aux_TP4Exo1.verifierBaseNombre(3, 14002));
		System.out.println("-------------------------------------------------------------");
		System.out.println(Aux_TP4Exo1.verifierBaseNombre(3, 12002));
		System.out.println("*************************************************************");
		
		//Tests pour la méthode calculerSomme
		//Le résultat obtenu doit être 100201
		System.out.println("En base 3 : (12002 + 11122) = "
								+ Aux_TP4Exo1.calculerSomme(3, 12002, 11122));
		System.out.println("-------------------------------------------------------------");	

		//Le résultat obtenu doit être 230335563
		System.out.println("En base 7 : (43524604 + 35652426 + 25203341 + 56321556) = " +
				Aux_TP4Exo1.calculerSomme(7, 43524604, 
						Aux_TP4Exo1.calculerSomme(7, 35652426,
								Aux_TP4Exo1.calculerSomme(7, 25203341, 56321556))));
		System.out.println("-------------------------------------------------------------");		

		//Tests pour la méthode decToBase
		//Le résultat obtenu doit être 106445636	
		System.out.println("Le nombre 6 549 563 en base 10 devient en base 7 : " 
							+ Aux_TP4Exo1.decToBase(6549563, 7));
		System.out.println("-------------------------------------------------------------");

		//Test pour la méthode baseToDec
		//Le résultat obtenu doit être 32044359
		System.out.println("Le nombre 536 241 534 en base 7 devient en base 10 : " 
				+ Aux_TP4Exo1.baseToDec(7, 536241534));
		System.out.println("-------------------------------------------------------------");

		//Test pour la méthode base1ToBase2
		//Le résultat obtenu doit être 40023401
		System.out.println("Le nombre 2 446 053 en base 7 devient en base 5 : " 
				+ Aux_TP4Exo1.base1ToBase2(7, 2446053, 5));	
		System.out.println("*************************************************************");

	}
}
