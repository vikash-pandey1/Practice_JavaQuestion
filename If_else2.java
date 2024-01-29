package sem_3;
import java.util.*;
public class If_else2 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your language");
        String  a = sc.nextLine();
        if/*(a=="java")*/(a.equals("java"))
        {
            System.out.println("java is the best language");
        }
        else
        {
            System.out.println(" it is not a good language");
        }
        sc.close();
    }
}
