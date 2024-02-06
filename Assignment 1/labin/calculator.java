package labin;

public class calculator 
{
	public double addition (double number [])
	{
		double c = number[1] + number[0];
		return c;
	}
	public double subtraction (double number [])
	{
		double c = number[0] - number[1];
		return c;
	}
	public double multiplication (double number [])
	{
		double c = number[1] * number[0];
		return c;
	}
	public double division (double number [])
	{
		double c = number[0] / number[1];
		return c;
	}
	public double sqroot (double number [])
	{
		double c = number[0] * number[0];
		return c;
	}
	public double power (double number [])
	{
		double c = 1;
		for (int i = 0;i<number[1];i++)
		{
			c = c*c;
		}
		return c;
	}
	public double mean (double number [])
	{
		double c = (number[0] + number[1])/2;
		return c;
	}
	public double variance (double number [])
	{
		double c=0;
		double x = mean(number);
		for (int i=1;i<2;i++)
		{
			c = c +((number[i]-x)*(number[i]-x));
		}
		c = c/2;
		return c;
	}
	public double std (double number [])
	{
		double c=Math.sqrt(variance(number));
		return c;
	}
	
}
