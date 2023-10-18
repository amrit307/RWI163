//hierrarical inheritance
import java.util.*;
class Shape
{
	protected int a;
	public void set(int x)
	{
	a=x;
	}
}
class Square extends Shape
{
	public void cal1()
	{
		System.out.println(a*a);
	}
}
class Cube extends Shape
{
	public void cal2()
	{
		System.out.println(a*a*a);
	}
public static void main(String[] args) {
	Square s = new Square();
	Cube c = new Cube();
	s.set(7);
	c.set(2);
	s.cal1();
	c.cal2();
}
}