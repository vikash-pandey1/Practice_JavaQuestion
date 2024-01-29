package sem_3;
import java.util.Scanner;

public class while_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        int i=1;
        while( i<=10)
        {
            System.out.println(no+"*"+i+"="+no*i);
            i++;
        }
        sc.close();
    }
}
