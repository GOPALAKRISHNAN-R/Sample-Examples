package palindrome;

import java.util.Scanner;

/**
 * Simple Java program for Palindrome
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


public class StrPal 
{

	public static void main(String[] args) 
	{
		String org,rev="";
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		org=sc.next();
		int len=org.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
			}

}
