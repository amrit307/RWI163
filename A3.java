import java.util.ArrayList;
import java.util.*;
class A3
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> l = new ArrayList<Integer>();
	  int i;
	  for(i=1;i<=5;i++)
	  {
	  	l.add(sc.nextInt());
	  }
	  int s=0;

	  for(int v:l)
	  {
	  s=s+v;
	  }

	  System.out.println(s);
	}
}