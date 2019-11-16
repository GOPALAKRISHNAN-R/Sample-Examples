package palindrome;

import java.util.Scanner;

/**
 * Simple Java program for Palindrome
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class NumPal
{

	public static void main(String[] args) 
	{
		int n,a,b,temp=0;
		System.out.println("Enter N value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		b=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			temp=(temp*10)+a;
		}
		if(b==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}

}
