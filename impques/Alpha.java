package impques;

import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        char c = sc.next().charAt(0);
        if(c>='a'&&c<='z'||c>='A'&& c<='Z'){
            System.out.println("this alphabet");
        }
        else{
            System.out.println("this is not a aphabet");
        }
        for(int i='A';i<'Z';i++){
            System.out.print((char)i+" ");
        }
        sc.close();
    }
}
