package impques;

import java.util.Scanner;

public class All_primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no ");
        int no = sc.nextInt();
        int temp =0;
        int count =0;
        for(int i=2;i<no;i++){
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==0){
                count++;
                // System.out.println(i);
            }else{
                temp=0;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
