package impques;

import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        int sum = 1;
        for(int i=1;i<=b;i++){
            sum*=a;
        }
        System.out.println(sum);
        sc.close();
    }
}
