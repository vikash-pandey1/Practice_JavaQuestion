public class Largest {
    public static void maxElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max element is: "+max);
    }
    public static void  minElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("min element is: "+min);
    }
    public static void main(String[] args) {
        int arr[] = {53,234,25,25,25,23,5};
        minElement(arr);
        maxElement(arr);
    }
}
