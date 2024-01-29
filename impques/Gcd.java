package impques;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        int gcd =0;
        // for(int i=1;i<=first&&i<=second;i++){
        //     if(first%i==0&&second%i==0){  // using for 
        //         gcd=i;
        //     }
        // }
        int temp =0;
        while (second!=0) {
            temp = second;
            second = first%second;  // using while loop
            first = temp;
        }
        gcd = first;
        System.out.println("gcd is "+gcd);
        sc.close();
    }
}
