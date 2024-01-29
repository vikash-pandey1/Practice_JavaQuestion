package sem_3;
import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        int a = amount*10/100;
        int b = amount-a;
        if(amount>=20000)
        {
            System.out.println("hurre you got this item in : " + b);
        }
        if(amount<20000&&amount>=10000)
        {
            //System.out.print("hurre you got this item in ");
            System.out.print("hurre you got this item in " + (amount-amount*5/100));
        }
        if(amount<10000&&amount>=5000)
        {
            System.out.println("hurre you got this item in "+ (amount-amount*2/100));
        }
        if(amount<5000)
        {
            System.out.println("sorry you are not eligible for discount you got this one in same price : " + amount);
        }
        sc.close();
    }
}
