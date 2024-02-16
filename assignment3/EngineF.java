package assignment3;
import java.util.*;
public class EngineF 
{
	ArrayList<Book> register = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addReg() {
        System.out.println("Enter number of Book that u want to add");
        int noOfReg = sc.nextInt();
        System.out.println("Enter Info/s");
        for (int i = 0; i < noOfReg; i++) {
            System.out.println("Enter ID");
            int id = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Price");
            double p = sc.nextDouble();
            Book b = new Book(id, name, p);
            register.add(b);
        }//for loop
    }
    public void printBookSDetails() {
        System.out.println("--------- Register Information --------");

        // System.out.println(register.toString());
        for (int i = 0; i < register.size(); i++) {
            printBook(i);
        }
    }//printBookDetails
    public void printBook(int i) {
        System.out.println("Student Id" + "\t" + "Student Name" + "\t" + "Student Marks" + "\t" + "Student DoB");
        System.out.println(register.get(i).getBkid() + "   " +
                register.get(i).getBkName() + "  " +
                register.get(i).getBkPrice());

    }//p
    public void deleteReg() {
        System.out.println("Enter Register Id for deleting the book");
        int bkid = sc.nextInt();
        for (int i = 0; i < register.size(); i++) {
            System.out.println(register.get(i).getBkid() + "deleted from ArrayList");
            if (register.get(i).getBkid() == bkid)
                register.remove(i);
            else {
                System.out.println("Details not available");
            }//else
        }//for
    }//deleteBook
    public void searchReg() 
    {
    	System.out.println("Enter Register Id for Searching the book");
        int bkid = sc.nextInt();
        for (int i = 0; i < register.size(); i++) 
        {
            System.out.println(register.get(i).getBkid() + "search from ArrayList");
            if (register.get(i).getBkid() == bkid)
                printBook(i);
            else {
                System.out.println("Details not available");
            }//else
        }
    }
    
    
}
