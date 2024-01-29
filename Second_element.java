import java.util.Arrays;

public class Second_element {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void original(){
        int arr[] = {1,23,43,53,453};
        arr[1] = 9;
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr1[] = arr.clone();
        System.out.println("copy array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void assending(int arr[]){
        int copy[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                copy[i] = arr[i];
            }
            System.out.print(copy[i]+" ");
        }
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
    public static void main(String[] args) {
        //original();
        int arr[] = {12,253,53,3,3,46,633};
        assending(arr);
    }
}
