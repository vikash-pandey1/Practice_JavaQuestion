package impques;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no ");
        int no = sc.nextInt();
        int temp = no;
        int len =0;
        while (temp!=0) {
            len++;
            temp/=10;
        }
        int temp2 = no;
        int rem = 1;
        int mul = 1;
        int arms =0;
        while (temp2!=0) {
            temp%=10;
            for(int i=1;i<=len;i++){
                mul*=rem;
            }
            arms+=mul;
            temp2/=10;
        }
        if(arms==no){
            System.out.println("the no is armstrong ");
        }else{
            System.out.println("the no is not armstrong no ");
        }
        sc.close();
    } 
}
