import java.util.*;

public class TApp
{
	public static void main(String[] args) 
	{
		double a, b, c, e, x;
		Scanner in = new Scanner(System.in);
	
		// Primeiro grau						
		System.out.println("1) Primeiro Grau. Entre com a, b, x:");
		a = in.nextDouble();
		b = in.nextDouble();
		x = in.nextDouble();
		
		TPrimeiroGrau pg = new TPrimeiroGrau(a, b);
		System.out.println("Y = " + pg.valorY(x));

		// Exponencial
		System.out.println("2) Exponencial. Entre com e:");
		e = in.nextDouble();
		x = in.nextDouble();
				
		TExponencial ex = new TExponencial(e);				
		System.out.println("Y = " + ex.valorY(x));
		
		// Segundo grau				
		System.out.println("3) Segundo Grau. Entre com a, b, c:");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		x = in.nextDouble();		
		
		TAdaptadorSegundoGrau sg = new TAdaptadorSegundoGrau((float)a, (float)b, (float)c);
		System.out.println("Y = " + sg.valorY(x));				
	}
}