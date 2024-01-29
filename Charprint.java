import java.util.Scanner;

public class Charprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        char c[] = new char[size];
        System.out.println("Enter your charcter");
        for(int i=0;i<c.length;i++){
            c[i] = sc.next().charAt(0);
        }
        for(char i:c){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
