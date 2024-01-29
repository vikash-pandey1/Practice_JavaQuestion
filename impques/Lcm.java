package impques;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        int gcd = 0;
        int lcm =0;
        int a = first;
        int b = second;
        while (second!=0) {
            if(first>second){
                first-=second;
            }else{
                second-=first;
            }
        }
        gcd = first;
        System.out.println("gcd is "+gcd);
        lcm = (a*b)/gcd;
        System.out.println("lcm is "+lcm);
        sc.close();
    }
}
