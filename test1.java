class Aman{
    int b ;
    static int b1;
}
public class test1 {
public static void main(String[] args) {
    Aman aman = new Aman();
    Aman.b1=100;
    aman.b= 10;
     
    System.out.println( Aman.b1);
}
}
