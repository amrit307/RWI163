import java.util.ArrayList;
class A2
{
	public static void main(String[] args)
	{

	  ArrayList<Integer> l = new ArrayList<Integer>();
	  l.add(10);
	  l.add(20);
	  l.add(30);
	  l.add(40);
	  l.add(50);

	  int s=0;

	  for(int v:l)
	  {
	  s=s+v;
	  }

	  System.out.println(s);
	}
}