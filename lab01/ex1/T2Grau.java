public class T2Grau 
{
	private float a, b, c;
	
	public T2Grau(float a, float b, float c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float calculaY(float x)
	{
		float delta = b*b - 4*a*c;
	
		return (float) ((b + Math.sqrt(delta))/(2*a));
	}
	
	public float getA()
	{
		return a;
	}
	
	public void setA(float a)
	{
		this.a = a;
	}
	
	public float getB()
	{
		return b;
	}
	
	public void setB(float b)
	{
		this.b = b;
	}
	
	public float getC()
	{
		return c;
	}
	
	public void setC(float c)
	{
		this.c = c;
	}	
}