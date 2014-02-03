public class TAdaptadorSegundoGrau extends TFuncao
{
	private T2Grau t2Grau;
	
	public TAdaptadorSegundoGrau(float a, float b, float c)
	{
		t2Grau = new T2Grau(a, b, c);
	}
	
	public double valorY(double x)
	{
		return t2Grau.calculaY((float) x);
	}
	
	public void setA(float a)
	{
		t2Grau.setA(a);
	}
	
	public void setB(float b)
	{
		t2Grau.setB(b);
	}
	
	public void setC(float c)
	{
		t2Grau.setC(c);
	}	
	
}