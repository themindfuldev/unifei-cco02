import java.util.*;

public class TTenente extends TPatente
{
	private int qtdMissoesCumpridas;
	private List<TSoldado> listaSoldados;
	
	public TTenente(int projeteis, int qtdMissoesCumpridas)
	{
		super(projeteis);
		this.qtdMissoesCumpridas = qtdMissoesCumpridas;
		listaSoldados = new ArrayList<TSoldado>();
	}
	
	public int getQtdMissoesCumpridas()
	{
		return qtdMissoesCumpridas;
	}
	
	public TSoldado adicionaSoldado(int projeteis, int quantidade)
	{
		TSoldado soldado = new TSoldado(projeteis, quantidade);
		listaSoldados.add(soldado);
	
		return soldado;
	}
	
	public void novaLideranca() 
	{
		TSoldado novoLider = null;
	
		for (TSoldado soldado: listaSoldados)
		{
			if (novoLider == null)
			{
				novoLider = soldado;
				continue;	
			}
				
			if (soldado.getQtdMaqDestruidas() > novoLider.getQtdMaqDestruidas())
				novoLider = soldado;
		}
		
		if (novoLider != null)
		{
			listaSoldados.remove(novoLider);
			novoLider.getHumano().setPat(this);
			this.setHumano(novoLider.getHumano());
		}		
	}	
	
	public int contaProjeteis()
	{
		int projeteisTotal = getProjeteis();			
	
		for (TSoldado soldado: listaSoldados)
		{
			projeteisTotal += soldado.contaProjeteis();
		}
	
		return projeteisTotal;
	}
	
	public String imprimeHierarquia()
	{
		StringBuilder hierarquia = new StringBuilder();
		
		hierarquia.append("-- Tenente: " + getHumano().toString());
	
		for (TSoldado soldado: listaSoldados)
		{
			hierarquia.append("\n-" + soldado.imprimeHierarquia());
		}	
		
		return hierarquia.toString();
	}	
}