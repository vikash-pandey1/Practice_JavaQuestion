// import java.util.Scanner;
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the row no that you want to print ");
//         int r = sc.nextInt();
//         System.out.println("enter the culom no that you want to print ");
//         int c = sc.nextInt();                                             // for border area print that you give input
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if( i == 1 || i==r || j == 1 || j == c ){
//                     System.out.print("*");
//                 }
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
// public class Nestedfor1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){                 // for simple 3*6 matrix
//             for(int j=1;j<=6;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {        // triangle pattern
//         for(int i = 1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {   // reverse triangle
//         for(int i =5;i>0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);      // for pyramid print
//         System.out.println("enter you row");
//         int r = sc.nextInt();
//         for(int i=0;i<=r;i++){
//             for(int j = 1;j<=r-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);      // for matrix   print
//         System.out.println("enter you row");
//         int r = sc.nextInt();
//         for(int i=1;i<=r;i++)
//         {
//             for(int j=i;j<=r;j++)
//             {
//                 System.out.print(j);
//             }
//             for(int k=1;k<=i-1;k++)
//             {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your row no");    // simple matrix
//         int r = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=r;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         System.out.println("enter your r");        // print 12121
//                                                        print 212121
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print(1);
//                 }
//                 else
//                 System.out.print(2);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your no");      // print 1 to r numeric no
//         int r = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your no that you want to print");  // print pyramid numeric
//         int no = sc.nextInt();
//         for(int i =1;i<=no;i++){
//             for(int j=1;j<=no-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(k);
//             }
//             for(int l=i-1;l>=1;l--){
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=9;i++){
//             for(int j=1;j<=9-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }                                // diamong shape pattern
//             System.out.println();
//         }
//         for(int i=9;i>=1;i--){
//             for(int j=1;j<=9-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=2*i-1;k>=1;k--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {       //for right half pyramid  19
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){  // 
//             for(int j=1;j<=i;j++){            
//                 System.out.print("*");
//             }
//             System.out.println();
//         }                              // halg right diamond  19,20 ,21
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your row that you want print");
//         int no = sc.nextInt();
//         for(int i=1;i<=no;i++)
//         {
//             for(int j=i;j<no;j++)
//             {
//                 System.out.print(" ");   // 22,23,24
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<=no;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<=no;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++){
//             for(int j=i;j<5;j++){
//                 System.out.print(" ");}      // half pyramid  with space 25 
//             for(int k=1;k<=i;k++){
//                 System.out.print(" "+"*");
//             }
//             System.out.println();
//         }
//     }
// }    
// public class Nestedfor1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the row no that you want to print");
//         int no = sc.nextInt();
//         for(int i=1;i<=no;i++){
//             for(int j=i;j<=no-1;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();   // diamond shape  26,27
//         }
        
//         for(int i=no;i>=1;i--){
//             for(int j=1;j<=no-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");   // backward line 28 with increment space
//             }
//             for(int k=1;k<=1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=1;k++){
//                 System.out.print("*");  // forwanr line with decreametn space
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");   //28
//             }
//             for(int k=1;k<=1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int l=5;l>=1;l--){
//             for(int j=1;j<=l-1;j++){
//                 System.out.print(" ");  // 28(b)
//             }
//             for(int k=1;k<=1;k++){
//                 System.out.print("*");
//             }
//                 System.out.println();
//             }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
// for(int i=4;i>=1;i--){
//     for(int j=1;j<=4-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=1;j++){
//         System.out.print("*");
//     }
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i =1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" "); // v shape patten ques 30 and reverse v
//     }
//     for(int k=1;k<=1;k++){
//         System.out.print("*");
//     }
//     for(int j=1;j<2*i-1;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=1;k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
// }


// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){
//     for(int j=1;j<=4-i;j++){
//         System.out.print(" ");  // v shape patten 29
//     }
//     for(int j=1;j<=1;j++){
//         System.out.print("*");
//     }
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=1;j++){
//         System.out.print("*");  1
//     }
//     System.out.println();
// }
//     }
// }


// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1 || i==5 || j==1 || j==5){  // 31 bordar of square with 
//                 System.out.print(" *");
//                 }
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
            
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);  //  32 right triangle with j print
//             }
//             System.out.println();
//         }
//     }
// }

// public class Nestedfor1{
//     public static void main(String[] args) {  // 32  right triangle with i print
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         int no = 1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" "+no);  // ques 33 right triangle with increment no 
//                 no++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             //int b=i;
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);  // ques 34 right triangle with reverse no
//             }
//             System.out.println();
//         }
//     }
// }

// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             for(int j=i-1;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Nestedfor1{
//     public static void main(String[] args) { // reverse triangle with reverse no
//         for(int i=5;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }  

// public class Nestedfor1{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             int no =i;
//             for(int j=1;j<=i;j++){
//                 System.out.print(no+" ");
//                 no=no+5-j;
//             }
//             System.out.println();
//         }
//     }
// }
// public class Nestedfor1{
//     public static void main(String[] args) {
//         int count = 0;
//         for(int i=1;i<=5;i++){
//             if(i%2!=0){
//                 for(int j=1;j<=3;j++){
//                 count+=1;
//                 System.out.print(count+" ");
//                 }
//             }
//             else {
//                 int temp = count+1;;
//                 for(int j=count+3;j>=temp;j--){
//                     count+=1;
//                     System.out.print(j+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }