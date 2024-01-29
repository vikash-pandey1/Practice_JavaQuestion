import java.util.*;
class Areaofcircle
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int r;
double pi = 3.14;
double area;
System.out.println("Enter your value of radious:");
r = s.nextInt();
area = pi * r * r;
System.out.println("Area of circle is:" +area);
}
}