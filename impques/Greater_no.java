package impques;

import java.util.Scanner;

public class Greater_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b >c){
            System.out.println("b is greater ");
        }else{
            System.out.println(" c is greater");
        }
        sc.close();
    }
}
