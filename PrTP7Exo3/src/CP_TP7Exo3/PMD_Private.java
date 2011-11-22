package CP_TP7Exo3;

//une classe pour instancier des objets PMD_Private
//qui ont des champs priv�s 
public class PMD_Private
{
	//les champs de la classe sont priv�s
	//ils peuvent �tre modifi�s ou lus � l'aide des m�thodes publiques 
	private char nomPoint = 'Z';
	private double posX = 0;
	
	//m�thode publique qui permet la modification du champ priv� "nomPoint"
	public void setNomPoint(char nouveauNom)
	{
		nomPoint = nouveauNom;
	}
	
	//m�thode publique qui permet la lecture du champ priv� "nomPoint"
	public char getNomPoint()
	{
		return nomPoint;
	}	
	
	//m�thode publique qui permet la modification du champ priv� "posX"
	public void setPosX(double nouvellePosition)
	{
		posX = nouvellePosition;
	}
	
	//m�thode publique qui permet la lecture du champ priv� "posX"
	public double getPosX()
	{
		return posX;
	}
	
	//m�thode publique qui affiche les informations sur chaque point
	public void afficher()
	{
		System.out.println("Mon nom est : " + nomPoint + ".");
		System.out.println("Mon abcisse est : " + posX + ".");
	}
}





