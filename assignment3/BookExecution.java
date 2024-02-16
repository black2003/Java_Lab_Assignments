package assignment3;

import java.util.Scanner;

public class BookExecution 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		EngineF b = new EngineF();
		b.addReg();
		b.printBookSDetails();
		b.deleteReg();
		b.printBookSDetails();
	}

}
