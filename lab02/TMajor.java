import java.util.*;

public class TMajor extends TPatente
{
	private int qtdMissoesCriadas;
	private List<TTenente> listaTenentes;
	
	public TMajor(int projeteis, int qtdMissoesCriadas)
	{
		super(projeteis);
		this.qtdMissoesCriadas = qtdMissoesCriadas;
		listaTenentes = new ArrayList<TTenente>();
	}
	
	public int getQtdMissoesCriadas()
	{
		return qtdMissoesCriadas;
	}
	
	public TTenente adicionaTenente(int projeteis, int quantidade)
	{
		TTenente tenente = new TTenente(projeteis, quantidade);
		listaTenentes.add(tenente);
	
		return tenente;
	}
	
	public void novaLideranca() 
	{
		TTenente novoLider = null;
	
		for (TTenente tenente: listaTenentes)
		{
			if (novoLider == null)
			{
				novoLider = tenente;
				continue;	
			}
				
			if (tenente.getQtdMissoesCumpridas() > novoLider.getQtdMissoesCumpridas())
				novoLider = tenente;
		}
		
		if (novoLider != null)
		{
			listaTenentes.remove(novoLider);
			novoLider.getHumano().setPat(this);
			this.setHumano(novoLider.getHumano());
		}		
	}	
	
	public int contaProjeteis()
	{
		int projeteisTotal = getProjeteis();			
	
		for (TTenente tenente: listaTenentes)
		{
			projeteisTotal += tenente.contaProjeteis();
		}
	
		return projeteisTotal;
	}	
	
	public String imprimeHierarquia()
	{
		StringBuilder hierarquia = new StringBuilder();
		
		hierarquia.append("- Major: " + getHumano().toString());
	
		for (TTenente tenente: listaTenentes)
		{
			hierarquia.append("\n-" + tenente.imprimeHierarquia());
		}	
		
		return hierarquia.toString();
	}
}