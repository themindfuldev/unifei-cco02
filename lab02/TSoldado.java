public class TSoldado extends TPatente
{
	private int qtdMaqDestruidas;
	
	public TSoldado(int projeteis, int qtdMaqDestruidas)
	{
		super(projeteis);
		this.qtdMaqDestruidas = qtdMaqDestruidas;
	}
	
	public int getQtdMaqDestruidas()
	{
		return qtdMaqDestruidas;
	}
	
	public void novaLideranca() { }
	
	public int contaProjeteis()
	{
		return getProjeteis();
	}
	
	public String imprimeHierarquia()
	{
		return "--- Soldado: " + getHumano().toString();
	}
}