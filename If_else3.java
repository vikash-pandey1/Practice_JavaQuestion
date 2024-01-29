package sem_3;
import java.util.*;
public class If_else3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the girls face reaction pathak ji ");
        String a = sc.nextLine();
        if(a.equals("smile")||a.equals("anger")&&a.equals("sad"))
        {
            System.out.println("The girls is ready to go in  oyo pathak ji ");
        }
        else
        {
            System.out.println("girls is not like you pathak ji");
        }
        sc.close();
    }
}
