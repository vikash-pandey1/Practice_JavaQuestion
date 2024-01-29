import java.util.Arrays;
class Hello 
{
int var;
String var2;
Hello(int v1,String v2)
{
this.var1 = v1;
this.var2 = v2;

}
Hello(){}

void m1()
{
System.out.println("hello class");
}
void m2()
{
System.out.println("hello class m2");
}
}
class Text extends Hello
{
Text(){}
Text(int a ,String b)
{
super(a,b);
System.out.println("");
void m1()
{
System.out.println("class Text m1...");
super.m1();
}
}
public static void main(String [] arfs)
{
Text t = new Text();
}
}


