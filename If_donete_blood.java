package sem_3;
import java.util.*;
public class If_donete_blood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        System.out.println("Enter your weight");
        int b = sc.nextInt();
        if(a>18)
        {
            if(b>50)
            {
                System.out.println("you are eligible for blood donate");
            }
            else
            {
                System.out.println("You are not eligible for blood donate ");
            }
        }
        else
        {
            System.out.println("You are not eligible for blood donate");
        }
        sc.close();
    }
}
