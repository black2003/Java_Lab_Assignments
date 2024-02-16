package assignment3;

import java.util.Scanner;

public class ExecutionS 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		SFunction s = new SFunction();
		s.addReg();
		s.deleteReg();
		s.printStudentDetails();
		s.updateReg();
		s.printStudentDetails();
	}

}
