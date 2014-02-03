import java.util.*;

public class TCoronel extends TPatente
{
	private int qtdGuerras;
	private List<TMajor> listaMajores;
	
	public TCoronel(int projeteis, int qtdGuerras)
	{
		super(projeteis);
		this.qtdGuerras = qtdGuerras;
		listaMajores = new ArrayList<TMajor>();
	}
	
	public int getQtdGuerras()
	{
		return qtdGuerras;
	}
	
	public TMajor adicionaMajor(int projeteis, int quantidade)
	{
		TMajor major = new TMajor(projeteis, quantidade);
		listaMajores.add(major);
	
		return major;
	}
	
	public void novaLideranca() 
	{
		TMajor novoLider = null;
	
		for (TMajor major: listaMajores)
		{
			if (novoLider == null)
			{
				novoLider = major;
				continue;	
			}
				
			if (major.getQtdMissoesCriadas() > novoLider.getQtdMissoesCriadas())
				novoLider = major;
		}
		
		if (novoLider != null)
		{
			listaMajores.remove(novoLider);
			novoLider.getHumano().setPat(this);
			this.setHumano(novoLider.getHumano());
		}		
	}	
	
	public int contaProjeteis()
	{
		int projeteisTotal = getProjeteis();	
	
		for (TMajor major: listaMajores)
		{
			projeteisTotal += major.contaProjeteis();
		}
	
		return projeteisTotal;
	}	
	
	public String imprimeHierarquia()
	{
		StringBuilder hierarquia = new StringBuilder();
		
		hierarquia.append("\n- Coronel: " + getHumano().toString());
	
		for (TMajor major: listaMajores)
		{
			hierarquia.append("\n-" + major.imprimeHierarquia());
		}	
		
		return hierarquia.toString();
	}
}