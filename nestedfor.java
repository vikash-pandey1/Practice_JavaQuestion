package sem_3;
public class nestedfor {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){{
                for(int k=5;k>=1;k--);{
                    System.out.print("*");
                }
            }
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
