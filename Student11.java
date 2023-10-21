import java.util.*;
class Student1
{
	private int rollno;
	private String name;
 // fetching the name and roll no of the student
public void set(int r,String n)
{
	rollno = r; name = n;
	
}
public int getrollno(){return rollno;}
public String getname(){return name;}
}
class Student11
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	Student1 s1= new Student1();
	System.out.println("enter the rollno and name of the student ");
	s1.set(sc.nextInt(),sc.next());
	System.out.println(s1.getrollno()+" "+s1.getname());
}
}