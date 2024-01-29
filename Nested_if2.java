package sem_3;
import java.util.*;
public class Nested_if2 {
    public static void main(String...v){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter the no");
       int a = sc.nextInt();
       if(a>0)
       {
        if(a<10)
        {
            if(a%2==0)
            {
                System.out.println("The no is even  and b/w 0 to 10");
            }
            else
            {
                System.out.println("The no is odd and b/w 0 to 10");
            }
        }
        else
        {
            System.out.println("The no is Greater than 10 please enter less than 10");
        }
       }
       else
       {
        System.out.println("The no less than 0 please greater than 0");
        }
        sc.close();
    }
}
