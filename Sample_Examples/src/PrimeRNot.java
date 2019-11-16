import java.util.Scanner;

/**
 * Simple Java program for Prime or Not
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class PrimeRNot 
{

	public static void main(String[] args) 
	{
		int n,t,f=0;
		System.out.println("Enter value:\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		t=n;
		t=n/2;
		if(n==0||n==1)
		{
			System.out.println("not Prime number...");
		}
		else
		{
			for(int i=2;i<t;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a prime");
					f=1;
					break;
				}
			}
			
			
		}
		if(f==0)
		{
			System.out.println("Prime..");
		}
		

	}

}
