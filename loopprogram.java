package sem_3;
import java.util.Scanner;

// public class loopprogram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no that you want to print table");
//         int no = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(no+"*"+i+" = "+no*i);
//         }

//     }
// }

// public class loopprogram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no that you want to print table");
//         int no = sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=no;i++){
//             fact*=i;
//         }
//         System.out.println(fact);
//     }
// }
public class loopprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no that you want to print table");
        int no = sc.nextInt();
        int rem=0;
        int ans =0;
        while(no>0){
            rem = no%10;
            ans = ans*10+rem;
            no = no/10;
        }
        System.out.println(ans);
        sc.close();
    }
}
