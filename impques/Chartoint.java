package impques;

import java.util.Scanner;

public class Chartoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character ");
        char ch = sc.next().charAt(0);
        int i = ch;
        System.out.println(i);
        System.out.println((int)ch);
        sc.close();
        for(int a=0;a<=255;a++){
            System.out.println("The ASCII value of "+(char)a+" = "+a);
        }
    }
}
