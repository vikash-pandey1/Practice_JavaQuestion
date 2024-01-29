import java.util.Arrays;

public class Array_concate {
    public static void main(String[] args) {
        int arr[] = {1,235,3535,53};
        int arr1[] = {5,353,53,66};
        int arr3[] = new int[arr.length+arr1.length];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr1, 0, arr3, arr1.length, arr1.length);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        // for (int i : arr3) {
        //     System.out.print(i+" ");
        // }
    }
}
