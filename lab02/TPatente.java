public abstract class TPatente
{
	private THumano humano;
	private int projeteis;
	
	public TPatente(int projeteis)
	{
		this.projeteis = projeteis;
	}

	public abstract void novaLideranca();
	public abstract int contaProjeteis();	
	public abstract String imprimeHierarquia();
	
	public void setHumano(THumano humano)
	{
		this.humano = humano;
	}
	
	public THumano getHumano()
	{
		return humano;
	}

	public void setProjeteis(int projeteis)
	{
		this.projeteis = projeteis;
	}
	
	public int getProjeteis()
	{
		return projeteis;
	}
}
