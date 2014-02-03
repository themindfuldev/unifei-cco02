public class THumano
{
	private String nome;
	private TPatente pat;
	private boolean vivo;
	
	public THumano(String nome, TPatente pat)
	{
		this.nome = nome;
		this.pat = pat;
		this.vivo = true;
		
		pat.setHumano(this);
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public TPatente getPat()
	{
		return pat;
	}
	
	public void setPat(TPatente pat)
	{
		this.pat = pat;
	}
	
	public boolean getVivo()
	{
		return vivo;
	}
	
	public String toString()
	{
		return "Nome: " + nome + ", vivo: " + vivo;
	}
	
	public void morrer()
	{
		this.vivo = false;
		pat.novaLideranca();
	}	
}