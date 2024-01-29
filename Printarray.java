import java.util.Scanner;

public class Printarray {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" element ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        
        sc.close();
    }
}
