package sem_3;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result =1;
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        for(int i =1;i<=second;i++){
            result=result*first;
        }
        System.out.println("result is "+result);
        sc.close();
    }
}
