import java.util.*;
abstract class Shape
{
	protected int a;
	public void set(int x) // abstract oops
	{
	 a=x;
	}
	abstract public void cal();
}
 class Cube extends Shape
 {
   public void cal()
   {
     System.out.println(a*a*a);
   }
 }
 class Sqrt extends Shape
 {
 	public void cal()
 	{
 		System.out.println(Math.sqrt(a));
 	}
 }
 class Square1 extends Shape
 {
 	public void cal()
 	{
 		System.out.println(a*a);
 	}

 	public static void main(String[] args) {
 		Cube c = new Cube();
 		Sqrt sq  = new Sqrt();
 		Square1 s = new Square1();

 		c.set(2);
 		sq.set(3);
 		s.set(4);

 		c.cal();
 		sq.cal();
 		s.cal();
 	}
 }