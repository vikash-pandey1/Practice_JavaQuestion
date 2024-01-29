package impques;

public class No_withoutloop {
    public static void print(int num){
        if(num<=100){
            System.out.println(num+" ");
            print(num+1);
        }
    }
    public static void main(String[] args) {
        
        print(1);
    }
}
