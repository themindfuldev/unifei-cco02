import java.util.*;
import orgaos.*;

public class TApp
{
	public static void main(String[] args) 
	{
		TCoracao coracao = new TCoracao();
		TPulmao pulmao = new TPulmao();
		TRim rim = new TRim();
		FachadaTransplanteTriplo fachada = new FachadaTransplanteTriplo(coracao, pulmao, rim);	
		
		int tamRim, ladoRim, tamPulmao, ladoPulmao, tamCoracao;
		Scanner in = new Scanner(System.in);
	
		// Primeiro grau						
		System.out.println("Entre com os atributos:");
		tamRim = in.nextInt();
		ladoRim = in.nextInt();
		tamPulmao = in.nextInt();
		ladoPulmao = in.nextInt();		
		tamCoracao = in.nextInt();
		
		fachada.setTamRim(tamRim);
		fachada.setLadoRim(ladoRim);
		fachada.setTamPulmao(tamPulmao);
		fachada.setLadoPulmao(ladoPulmao);
		fachada.setTamCoracao(tamCoracao);		
				
	}
}