import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter your string");
        String[] str1 = new String[size];
        for(int i=0;i < str1.length;i++){
            str1[i]= sc.next();
        }
        for(String print:str1){
            System.out.println(print);
        }

        // String str[] = {"vikash","vinay","bk"};
        // String arr[] = new String[3];
        // arr[0] = "bkg";
        // arr[1] = "lsf";
        // arr[2] = "sfk";
        // for(String i:arr){
        //     System.out.print(i+" ,");
        // }
        // for(String a:str){
        //     System.out.println(a+"");
        // }
        sc.close();
    }
}
