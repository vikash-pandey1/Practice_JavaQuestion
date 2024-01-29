package impques;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your no");
        int no = sc.nextInt();
        int sum = 1;
        while (no>0) {
            sum = sum*no;
            no--;
        }
        System.out.println(sum);
        sc.close();
    }
}
