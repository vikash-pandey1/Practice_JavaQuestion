package impques;

import java.util.Scanner;

public class Compound_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount ");
        double a = sc.nextDouble();
        System.out.println("Enter the rate fo intrestg ");
        double r = sc.nextDouble();
        System.out.println("Enter the time period");
        double t = sc.nextDouble();
        double future_ci,ci;
        future_ci = a*(Math.pow((1+r/100),t));
        ci = future_ci-a;
        System.out.println("total amount is : "+future_ci);
        System.out.println("only intrest charge is: "+ci);
        sc.close();
    }
}
