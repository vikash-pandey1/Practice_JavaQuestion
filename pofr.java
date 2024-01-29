import java.util.*;
class Pofr
{
public static void main(String args[])
{
 
Scanner s = new Scanner(System.in); int l, b;
double rectangle;
System.out.println("Enter your value of length:"); l = s.nextInt();
System.out.println("Enter Your value of breadth:"); b = s.nextInt();
rectangle = 2*(l+b);
System.out.println("Perimeter of rectangle:" +rectangle);
}
}
