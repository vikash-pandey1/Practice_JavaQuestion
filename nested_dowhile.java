package sem_3;
public class nested_dowhile {
    public static void main(String[] args) {
        do{
            System.out.println(10);
            do{
                System.out.println(20);
            }while(false);
        }while(false);
    }
}
