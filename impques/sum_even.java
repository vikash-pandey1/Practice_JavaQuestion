package impques;

import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first input");
        int no = sc.nextInt();
        int sum =0;
        for(int i=1;i<=no;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
