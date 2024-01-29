package impques;

import java.util.Scanner;

public class Fibonacci_recursion {
    static int a =0,b =1;
    public static void rec(int no){
        if(no>=1){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            rec(no-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        System.out.print(a+" "+b+" ");
        rec(no);
        sc.close();
    }
}
