import java.util.ArrayList;
class A1
{
	public static void main(String[] args)
	{

	  ArrayList<Integer> l = new ArrayList<Integer>();
	  l.add(10);
	  l.add(20);
	  l.add(30);
	  l.add(40);
	  l.add(2,45);
	  l.add(3,53);
     int i;
     for(i=0;i<l.size();i++)
     {
     System.out.println(l.get(i));
     }
	}
}