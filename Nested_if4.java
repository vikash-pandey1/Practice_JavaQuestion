package sem_3;
import java.util.*;
public class Nested_if4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18)
        {
            if(age<=60)
            {
                System.out.println("You are eligible to work");
            }
            else
            {
                System.out.println("You are to old to work");
            }
        }
        else
        {
            System.out.println("you are minor not eligible  to work");
        }
        sc.close();
    }
}
