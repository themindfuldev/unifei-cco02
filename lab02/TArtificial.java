public class TArtificial extends THumano
{
	private int tecLuta;
	
	public TArtificial(String nome, TPatente pat, int tecLuta)
	{
		super(nome, pat);
		this.tecLuta = tecLuta;
	}
	
	public int getTecLuta()
	{	
		return tecLuta;
	}
	
	public String toString()
	{
		return super.toString() + ", tecLuta: " + tecLuta;
	}	
}