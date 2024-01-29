package impques;

import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        int rem = 0;
        int sum =0;
        while (no!=0) {
            rem = no%10;
            sum = sum*10+rem;
            no /=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
