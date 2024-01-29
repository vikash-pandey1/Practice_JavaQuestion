package sem_3;
import java.util.*;
public class Swape_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of a");
        int a = sc.nextInt();
        System.out.println("Enter the no of b");
        int b = sc.nextInt();
        /*int c = b;
        b = a;
        a = c;                   // swaping with third vatiable
        System.out.println("b is = "+b);
        System.out.println("a is = "+a);
        sc.close();*/
        a = a+b;   // a = 10 b = 20      swaping without third variable
        b = a-b;
        a = a-b;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        sc.close();
    }
}
