import java.util.*;
class A5
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    ArrayList<Integer> l2 = new ArrayList<Integer>();

    int i,s=0;
    for(i=1;i<=5;i++)
     {
       l1.add(sc.nextInt());
     }

    for(i=0;i<l1.size();i++)
     { 
       s=s+l1.get(i);
       l2.add(s);
     }
     System.out.println(l2);		
}
}