package impques;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        int temp = no;
        int sum =0;
        int rem =0;
        while (temp!=0) {
            rem = temp%10;
            sum = sum*10+rem;
            temp/=10;
        }
        //System.out.println(sum);
        if(no == sum){
            System.out.println("the no is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
