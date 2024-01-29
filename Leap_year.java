package sem_3;
import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int a = sc.nextInt();
        if(((a%4==0)&&(a%100!=0))||(a%400==0))
        {
            System.out.println("This is  leap year");
        }
        else
        {
            System.out.println("This is no a leap year");
        }
        sc.close();
    }
}
