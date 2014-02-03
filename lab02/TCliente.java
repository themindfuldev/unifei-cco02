public class TCliente
{
	public static void main(String[] args)
	{
		THumano humano;
		TCoronel coronel;
		TMajor major;
		TTenente tenente;
		TSoldado soldado;
		
		// Constroi hierarquia
		coronel = new TCoronel(10, 5);		
		humano = new TTradicional("Tiago", coronel, 22);		
		
		major = coronel.adicionaMajor(8, 6);
		humano = new TArtificial("Trops", major, 15);
		
		major = coronel.adicionaMajor(6, 10);
		humano = new TArtificial("Robo", major, 15);		
		
		tenente = major.adicionaTenente(8, 8);
		humano = new TTradicional("Rui", tenente, 23);		
		
		tenente = major.adicionaTenente(9, 4);
		humano = new TTradicional("Heron", tenente, 24);		

		soldado = tenente.adicionaSoldado(15, 18);
		humano = new TTradicional("Grilo", soldado, 22);		
		
		soldado = tenente.adicionaSoldado(25, 10);
		humano = new TTradicional("TiFee", soldado, 22);
		
		System.out.println(coronel.imprimeHierarquia());
		System.out.println(coronel.contaProjeteis());
		
		// Mata um
		major.getHumano().morrer();
		
		System.out.println(coronel.imprimeHierarquia());
		System.out.println(coronel.contaProjeteis());
		
	}
}