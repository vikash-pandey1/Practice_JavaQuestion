package impques;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        double f = sc.nextDouble();
        System.out.println("Enter your second no");
        double s = sc.nextDouble();
        System.out.println("Enter any operator + - * / %");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(f+s);
                break;
            case '-':
            System.out.println(f-s);
            break;
            case '*':
            System.out.println(f*s);
            break;
            case '/':
            System.out.println(f/s);
            break;
            case '%':
            System.out.println(f%s);
            break;
            default:
            System.out.println("Enter your valid input");
                break;
        }
        sc.close();
    }
}
