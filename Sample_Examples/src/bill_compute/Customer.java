package bill_compute;

import java.util.Scanner;

/**
 * Simple Java program for Billing System
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Customer 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int in_id,p_id,qty,itemA=200,itemB=75,itemC=500;
		String c_name,adrs;
		boolean ch;		
		double dis=0.1,tax=0.05,p1=0,p2=0,p3=0,p4=0;
		long ph_no;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("INVOICE BILLING SYSTEM");
		System.out.println("Enter Invoice Id:");
		in_id=sc.nextInt();
		System.out.println("Enter Customer Name:");
		c_name=sc.next();
		System.out.println("Enter Address:");
		adrs=sc.next();
		System.out.println("Enter phone number:");
		ph_no=sc.nextLong();
		do
		{
			System.out.println("Product_id:");
			p_id=sc.nextInt();
			switch(p_id)
			{
			case 1:
				System.out.println("Enter Quantity:");
				qty=sc.nextInt();
				p1=qty*itemA;
				break;
			case 2:
				System.out.println("Enter Quantity:");
				qty=sc.nextInt();
				p2=qty*itemB;
				break;
			case 3:
				System.out.println("Enter Quantity:");
				qty=sc.nextInt();
				p3=qty*itemC;
				break;
			default:
				System.out.println("NO SUCH PRODUCT ID");
			
			}
			
			
			System.out.println("Do u Want Contine:(yes/no)?");
			ch=sc.nextBoolean();
		}while(ch);
		
			p4=p1+p2+p3;
			p4=p4-dis;
			p4=p4+tax;
			
			System.out.println();
			System.out.println("\t\tBilling System");
			System.out.println("\t\t------- ------");
			System.out.println("Invoice_Id"+in_id);
			System.out.println("Customer Name:"+c_name);
			System.out.println("Address:"+adrs);
			System.out.println("Phone no:"+ph_no);
			System.out.println("Total price:"+p4);
		}
}
