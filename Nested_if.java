package sem_3;
import java.util.*;
public class Nested_if {// right a program to check wheather it is less than 100 or check between 100 to 50 
    public static void main(String...v){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no");
        int a = sc.nextInt(); //if true than print no is b/w 50 to 100
        if(a<100)
        {
            if(a>50)
            {
                System.out.println("The no is between 50 and 100");
            }
            else
            {
                System.out.println("The no is less than 50 :..: please enter b/w 50 to 100");
            }
        }
        else
        {
            System.out.println("The no is greater than 100 :..: please enter less than 100 ");
        }
        sc.close();
    }
}
