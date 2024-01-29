package sem_3;
public class While {
    public static void main(String[] args) 
    {                                                       //right a program to print value from 1 to 10
        /*int i = 1;
        while(i<=10)
        {
            System.out.println(i);                          //write a program to print my section is best infinite
            i++;
        }*/
        /*while(true){
            System.out.println("my section is best");     // infinite loop
        }*/
        int i = 0,sum = 0;
        while(i<=10)
        {
            sum = sum+i;
                        // write a program 
            i++;
        }
        System.out.println(sum);
        /*int i = 10;
        while(i>0)
        {
            System.out.println(i); //write a program to print value 10 to 1 
            i--;
        }*/
    }
}
