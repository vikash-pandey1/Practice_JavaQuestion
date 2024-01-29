package impques;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int number = sc.nextInt();
        System.out.println("square root of "+number+" = "+number*number);
        sc.close();
    }
}
