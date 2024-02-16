package assignment6;

import java.util.ArrayList;

public class Result extends Student implements Inferface_EXAM 
{
	ArrayList<Student> stdn;
	@Override
	public int Percentage_calc(int m1,int m2) {
		int sum;
		sum = ((m1+m2)/200)*100;
		return sum;
	}
	public Result()
	{
		stdn = new ArrayList<Student>(5);
	}
	public void display(ArrayList<Student> n)
	{
		
	}
	public static void main(String[]args)
	{
		System.out.println("Enter the num!");
		
	}
	

}
