import java.util.Arrays;
public class Test
{
public static void main(String[] args)
{
System.out.println(Arrays.toString(args));

/*double sum=0;
for (String s : args)
sum = sum +Double.parseDouble(s);
System.out.println("sum = "+sum);*/

double d1 = Double.parseDouble(args[0]);
double d2 = Double.parseDouble(args[1]);

System.out.println("sum = "+(d1+d2));



}
}