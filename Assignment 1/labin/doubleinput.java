package labin;
import java.util.*;

public class doubleinput 
{
	public double[] nubber()
	{
		Scanner sc = new Scanner(System.in);
		double number [] = new double[2];
		System.out.println("Enter first number");
		number [0] = sc.nextDouble();
		System.out.println("Enter second number");
		number [1] = sc.nextDouble();
		sc.close();
		return number;
	}
	public double[] nubber1()
	{
		Scanner sc = new Scanner(System.in);
		double number [] = new double[1];
		System.out.println("Enter number");
		number [0] = sc.nextDouble();
		sc.close();
		return number;
		
	}
	public double[] nubber2()
	{
		Scanner sc = new Scanner(System.in);
		double number [] = new double[1];
		System.out.println("Enter number");
		number [0] = sc.nextDouble();
		System.out.println("Enter to the power");
		number [1] = sc.nextDouble();
		sc.close();
		return number;
		
	}
	
}
