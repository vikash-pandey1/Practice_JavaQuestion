import java.util.Scanner; class Pofc
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int r;
double pi = 3.14, perimeter;
System.out.println("Enter Your value of r:");
r = s.nextInt();
perimeter = 2 * pi * r;
System.out.println("Perimeter of circle is:" +perimeter);
}
}
