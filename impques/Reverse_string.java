package impques;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        String s = "";
        for(int i=str.length()-1;i>=0;i--){
            s = s+str.charAt(i);
        }
        System.out.println(s);
        sc.close();
    }
}
