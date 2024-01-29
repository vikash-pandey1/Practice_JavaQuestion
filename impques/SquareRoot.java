package impques;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        double f = sc.nextFloat();
        double suare = Math.sqrt(f);
        System.out.println(suare);
        sc.close();
    }
}
