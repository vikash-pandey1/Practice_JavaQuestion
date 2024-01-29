package sem_3;
import java.util.Scanner;
public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you no");
        int no = sc.nextInt();
        int sum = 0;
        while(no>=0){
            sum = sum+no;
            System.out.println("Enter you no");
            no = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
