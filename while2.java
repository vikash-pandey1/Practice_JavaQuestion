package sem_3;
import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        double fact =1;
        while(no>0)
        {
            fact = fact*no; 
            
            no--;
            
        }
        System.out.println(fact);
        sc.close();
    }
}
