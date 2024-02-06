package labin;

import java.io.IOException;

public class Partb {

	public static int factorial(int fact)
	{
		if(fact < 0)
		{
			return -99;
		}
		else
		{
			if(fact == 0)
			{
				return 1;
			}
			else
			{
				return fact * factorial(fact-1);
			}
		}
	}
	
	public static void main(String[] args) 
			throws IOException
	{
		
		Parta a= new Parta();
		System.out.println("Enter the number to factorial");
		int k = a.getData();
		int y = factorial(k);
		System.out.println("Factorial is :" + y);
	}

}

