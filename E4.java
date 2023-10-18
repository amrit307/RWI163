import java.util.*;
class E1
{
	protected int a,b;
	public void set(int x, int y)
	{
	  a=x;b=y;
	}
}
class E2 extends E1//sum
{

	public void call1()
      
	{
		int s=0;
	  for(int i=a;i<=b;i++)// here we cannot initialize a and b again and again
	  {
        s=s+i;
        System.out.print("sum = ");
        System.out.println(s);
	  }
	}
}
class E3 extends E2//factorial
{
	public void call2()
	
	{
		int n,i,f=1;
		for(n=a;n<=b;n++)
		{
      for(i=n;i>=1;i--)
        {
      		f=f*i;
      	}
      	System.out.print("factorial = ");
      	System.out.println(f);
      	}
      }
    }
	

class E4 extends E3//prime
{
	public void call3()
	{
	int i,n,c=0;
	for(n=a;n<=b;n++)
		{
      for(i=1;i<=n/2;i++)
      {
      	if(n%i==0)
      	{
      		c=c+1;
      	}
      }
      	if(c==1)
      	{
      		System.out.print("prime no :");
      		System.out.println(n);
      	}
      	c=0;
      }
  }
      public static void main(String[] args) 
      {
      	E4 r = new E4();
      	r.set(1,5);
      	r.call1();
      	r.call2();
      	r.call3();
      }
  }


  