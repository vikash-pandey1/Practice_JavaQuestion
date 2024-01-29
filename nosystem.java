package sem_3;
import java.util.Scanner;

public class nosystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your decimal no");  // decimal to binary
        int decimal_no = sc.nextInt();
        int ans =0;
        int pw =1;
        while(decimal_no>0){
            int parity = decimal_no%2;
            ans +=(parity*pw);
            decimal_no/=2;
            pw*=10;
        }
        System.out.println(ans);
        //int binary_num = sc.nextInt();
        // int ans = 0;
        // int pw = 1;
        // while(binary_num >0){
        //     int unit_digit = binary_num%10;     // binary to decimal
        //     ans +=(unit_digit*pw);
        //     binary_num /=10;
        //     pw*=2;
        // }
        // System.out.println(ans);

        sc.close();
    }
}
