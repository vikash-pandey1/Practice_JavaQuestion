package sem_3;
import java.util.*;
public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        float a = sc.nextInt();
        System.out.println("Enter the second no");
        float b = sc.nextInt();
        System.out.println("Enter the case no which operation you want to perform");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("please enter the no 1 to 5");
        }
        sc.close();
    }
}
