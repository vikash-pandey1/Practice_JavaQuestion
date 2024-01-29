package sem_3;
//import java.util.Scanner;
//import java.lang.*;
public class do_while {
    public static void main(String[] args) {
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();        
        System.out.println("Enter second no"); 
        int b = sc.nextInt();
        int a,b,c,hcd=0;  // print 1 to 10 using do while
        int i=1;*/
        /*do{
            System.out.println(i);
            i++;
        }
        while(i<=no);*/
        /*do{               // print string infinite time
            System.out.println("i am best");
        }
        while(true);*/
        /*int sum = 0;
        int i = 1;
        do{
            sum = sum+i;
            //System.out.println(sum);
            
            i++;
        }
        
        while(i<=100);
        System.out.println(" The submission of 1 to 100 :"+ sum);*/
        
    /*try {
        do{
            System.out.println("start processing ");
            System.out.println("block of code is executed");
            System.out.println("end processing of do while");
            Thread.sleep(10000);
        }while(true);
    } catch (Exception e) {
        System.out.println(e);
    }*/
    int a=20;
    int b=40;
    int i=a/2;
    do{
        if(a%i==0&&b%i==0){
            
            System.out.println(i);
            break;
        }
        else{
            i--;
        }
        
    }while(i>0);
    /*Scanner sc = new Scanner(System.in);
    System.out.println("enter first no");
    int dividend = sc.nextInt();
    System.out.println("enter second no");
    int divisor = sc.nextInt();
    int remainder;
    int hcf=1;
    do{
        remainder = dividend%divisor;
        if(remainder==0){
            hcf=divisor;
        }
        else{
            dividend=divisor;
            divisor=dividend;
        }
    }while(remainder!=0);
    System.out.println(hcf);
    }*/
}
}
