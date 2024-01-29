import java.util.Scanner;
class Rectangle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first value");
int a = sc.nextInt();
System.out.println("Enter your second value");
int b = sc.nextInt();
System.out.println("Area of rectangle is " +a*b);
if(a==b)
{
System.out.println("It is square");
}
else
{
System.out.println("It is rectangle");
}
}
}