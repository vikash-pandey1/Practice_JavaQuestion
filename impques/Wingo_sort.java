package impques;

import java.util.Arrays;

public class Wingo_sort {
    public static void sort(int arr[]){
        Arrays.sort(arr);
        int arr1[] = new int[arr.length];
        int left = 0;
        int mid = arr.length/2;
        for(int i=0;i<arr.length-1;i+=2){
            arr1[i] = arr[left++];
            arr1[i+1] = arr[mid++];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,3,1};
        sort(arr);

    }
}
