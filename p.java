package sem_3;
import java.util.Scanner;

public class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your row no");
        int r=sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}