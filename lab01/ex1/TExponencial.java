public class TExponencial extends TFuncao
{
	private double e;
	
	public TExponencial()
	{
		this.e = Math.E;
	}
	
	public TExponencial(double e)
	{
		this.e = e;
	}
	
	public double valorY(double x)
	{
		return Math.pow(e, x);
	}
	
	public double getE()
	{
		return e;
	}
	
	public void setE(double e)
	{
		this.e = e;
	}
}