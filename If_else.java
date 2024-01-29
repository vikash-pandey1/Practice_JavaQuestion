package sem_3;
import java.util.*;
public class If_else {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int a =sc.nextInt();
        if (a<0)
        {
            System.out.println("The no is negative");
        }
        System.out.println("The is positive");
        sc.close();
    }
}
