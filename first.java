import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String f = sc.nextLine();
        System.out.println("Enter your second name");
        String s = sc.nextLine();
        char first=' ';
        char second=' ';
        for(int i=0;i<f.length();i++){
            if(i==0){
                first=f.charAt(i);
            }
        }
        for(int i =0;i<s.length();i++){
            if(i==0){
                second = s.charAt(i);
            }
        }
        System.out.println(first+" "+second);
        sc.close();
    }
}
