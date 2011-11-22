package CP_TP7Exo3;

//une classe pour instancier des objets PMD_Public
//qui ont des champs publics
public class PMD_Public
{
	//les champs de la classe sont publics 
	//ils peuvent �tre lus ou modifi�s � l'aide de l'op�rateur "."
	public char nomPoint;
	public double posX;
	
	//m�thode publique qui affiche les informations sur chaque point
	public void afficher()
	{
		System.out.println("Mon nom est : " + nomPoint + ".");
		System.out.println("Mon abcisse est : " + posX + ".");
	}
	
}