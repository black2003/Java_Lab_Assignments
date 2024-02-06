package labin;
import java.util.*;
public class lab1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		doubleinput d = new doubleinput();
		calculator er = new calculator();
		double mr [] = new double[2];
		double kn;
		int ex=0;
		
		do 
		{
		System.out.println("enter choice:");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			mr = d.nubber();
			 kn = er.addition(mr);
			System.out.println("addition :" + kn);
			break;
		case 2:
			mr = d.nubber();
			 kn = er.subtraction(mr);
			System.out.println("subtraction :" + kn);
			break;
		case 3:
			mr = d.nubber();
			 kn = er.multiplication(mr);
			System.out.println("multiplication :" + kn);
			break;
		case 4:
			mr = d.nubber();
			 kn = er.division(mr);
			System.out.println("division :" + kn);
			break;
		case 5:
			mr = d.nubber1();
			 kn = er.sqroot(mr);
			System.out.println("sqroot :" + kn);
			break;
		case 6:
			mr = d.nubber2();
			 kn = er.power(mr);
			System.out.println("power :" + kn);
			break;
		case 7:
			mr = d.nubber();
			 kn = er.mean(mr);
			System.out.println("mean :" + kn);
			break;
		case 8:
			mr = d.nubber();
			 kn = er.variance(mr);
			System.out.println("variance :" + kn);
			break;
		case 9:
			mr = d.nubber();
			 kn = er.std(mr);
			System.out.println("std :" + kn);
			break;
		case 10:
			ex = 1;
			System.out.println("Exit Status : 1");
			break;
		default:
			System.out.println("no such choice please enter the right choice dawg!!!");
		}
		
		}
		while(ex == 0);
		sc.close();
	}

}
