import java.util.Scanner;
 class Poft
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in); int l1, l2, l3;
int triangle;
System.out.println("Enter your first side of length:"); l1 = s.nextInt();
System.out.println("Enter your second side of length:"); l2 = s.nextInt();
System.out.println("Enter your third side of length:"); l3 = s.nextInt();
triangle = l1 + l2 + l3;
System.out.println("Perimeter of triangle is:" +triangle);
}
}
