package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class SFunction 
{
	ArrayList<Student> register = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addReg() {
        System.out.println("Enter number of Register that u want to add");
        int noOfReg = sc.nextInt();
        System.out.println("Enter Info/s");
        for (int i = 0; i < noOfReg; i++) {
            System.out.println("Enter Prn");
            int id = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Marks");
            double p = sc.nextDouble();
            System.out.println("Enter DoB");
            String dob = sc.next();
            Student b = new Student(id, name, dob, p);
            register.add(b);
        }//for loop
    }
    public void printStudentDetails() {
        System.out.println("--------- Register Information --------");

        // System.out.println(register.toString());
        for (int i = 0; i < register.size(); i++) {
            printStudent(i);
        }
    }//printBookDetails
    public void printStudent(int i) {
        System.out.println("Student Id" + " \t" + "Student Name" + " \t" + "Student Marks" + " \t" + "Student DoB");
        System.out.println(register.get(i).getPrn() + "\t" +
                register.get(i).getName() + "\t" +
                register.get(i).getMarks() + "\t" + register.get(i).getDob());

    }//p
    public void deleteReg() {
        System.out.println("Enter Register Id for deleting the Student");
        int bkid = sc.nextInt();
        for (int i = 0; i < register.size(); i++) {
            System.out.println(register.get(i).getPrn() + "deleted from ArrayList");
            if (register.get(i).getPrn() == bkid)
                register.remove(i);
            else {
                System.out.println("Details not available");
            }//else
        }//for
    }//deleteBook
    public void searchReg() 
    {
    	System.out.println("Enter Register Id for Searching the Student");
        int bkid = sc.nextInt();
        for (int i = 0; i < register.size(); i++) 
        {
            System.out.println(register.get(i).getPrn() + "search from ArrayList");
            if (register.get(i).getPrn() == bkid)
                printStudent(i);
            else {
                System.out.println("Details not available");
            }//else
        }
    }
    public void updateReg()
    {
    	System.out.print("Enter PRN for updating the Student Information: ");
    	int prn = sc.nextInt();
    	//System.out.println("PRN\t Name\t DoB\t Marks");
    	for(int i = 0; i < register.size(); i++)
    	{
    		if(register.get(i).getPrn() == prn)
    		{
    			System.out.print("Enter updated Name: ");
    			String name = sc.next();
    			System.out.print("Enter updated Dob: ");
    			String dob = sc.next();
    			System.out.print("Enter updated Marks: ");
    			double marks = sc.nextDouble();
    			register.get(i).setName(name);
    			register.get(i).setDob(dob);
    			register.get(i).setMarks(marks);
    		}
    		else
    		{
    			System.out.println("Student does not exist");
    		}
    	}
    }

}
