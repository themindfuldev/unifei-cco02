package orgaos;

public class FachadaTransplanteTriplo
{
	private TCoracao coracao;
	private TPulmao pulmao;
	private TRim rim;
	
	public FachadaTransplanteTriplo(TCoracao coracao, TPulmao pulmao, TRim rim)
	{
		this.coracao = coracao;
		this.pulmao = pulmao;
		this.rim = rim;		
	}
	
	public int getTamRim()
	{
		return rim.getTamanho();
	}
	
	public void setTamRim(int tamanho)
	{
		rim.setTamanho(tamanho);
	}
	
	public int getLadoRim()
	{
		return rim.getLado();
	}
	
	public void setLadoRim(int lado)
	{
		rim.setLado(lado);
	}
	
	public int getTamPulmao()
	{
		return pulmao.getTamanho();
	}
	
	public void setTamPulmao(int tamanho)
	{
		pulmao.setTamanho(tamanho);
	}
	
	public int getLadoPulmao()
	{
		return pulmao.getLado();
	}
	
	public void setLadoPulmao(int lado)
	{
		pulmao.setLado(lado);
	}	
	
	public int getTamCoracao()
	{
		return coracao.getTamanho();
	}
	
	public void setTamCoracao(int tamanho)
	{
		coracao.setTamanho(tamanho);
	}	
	
}