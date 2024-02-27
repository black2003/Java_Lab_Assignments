package Assignment_5;

import java.util.*;

class circle implements Interface_S
{
    double x;
    
    public circle(double x) {
        this.x = x;
    }

    @Override
    public double area() {
        
        double are = 3.14*(x*x);
        return are;
    }

    @Override
    public double perimeter() {
        
        double per = 3.14*2*x;
        return per;
    }

}

class rectangle implements Interface_S
{
    double x,y;
    
    public rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        
        double are = x*y;
        return are;
    }

    @Override
    public double perimeter() {
        
        double per = 2*(x+y);
        return per;
    }

}

class triangle implements Interface_S
{
    double x,y,z;
    
    
    public triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        
        double s = (x+y+z)*0.5;
        double are = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return are;
    }

    @Override
    public double perimeter() {
    
        double per = x+y+z;
        return per;
    }

}

public class Shape 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shapes Lol!!!");
        System.out.println("enter x , y for rectangle");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        rectangle re = new rectangle(x, y);
        System.out.println("The peremeter = "+re.perimeter() + "\n" + "The area = "+ re.area());
        System.out.println("enter r for circle");
        x = sc.nextDouble();
        circle ce = new circle(x);
        System.out.println("The peremeter = "+ce.perimeter() + "\n" + "The area = "+ ce.area());
        System.out.println("enter x , y ,z for triangle");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double z = sc.nextDouble();
        triangle te = new triangle(x, y,z);
        System.out.println("The peremeter = "+te.perimeter() + "\n" + "The area = "+ te.area());
        sc.close();
    }
    
}
