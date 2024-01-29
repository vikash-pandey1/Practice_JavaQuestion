class Student
{
     String name;
     int age;
     int roll;
}
class Test
{
public static void main(String [] x)
{
 Student s1 = new Student();
 Student s1 = new Student();
 Student s1 = new Student();
 Student s1 = new Student();
s1.name = "ABC";
s1.age = 12;
s1.roll = 11;
s2 = s1;
s3 = s2;
s3.name = "vikash";
System.out.println("name : "+s2.name);
System.out.println("age: "+s2.age);
System.out.println("roll : "+s2.roll);

System.out.println("name : "+s1.name);
System.out.println("age : "+s1.age);
System.out.println("roll : "+s1.roll);
}
}