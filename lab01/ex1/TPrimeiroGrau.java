public class TPrimeiroGrau extends TFuncao
{
	private double a, b;
	
	public TPrimeiroGrau(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public double valorY(double x)
	{
		return a*x + b;
	}
	
	public double getA()
	{
		return a;
	}
	
	public void setA(double a)
	{
		this.a = a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public void setB(double b)
	{
		this.b = b;
	}
}