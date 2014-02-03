public class TTradicional extends THumano
{
	private int idade;
	
	public TTradicional(String nome, TPatente pat, int idade)
	{
		super(nome, pat);
		this.idade = idade;
	}
	
	public int getIdade()
	{	
		return idade;
	}
	
	public String toString()
	{
		return super.toString() + ", idade: " + idade;
	}	
}