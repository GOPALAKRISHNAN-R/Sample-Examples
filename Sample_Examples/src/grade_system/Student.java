package grade_system;

import java.util.Scanner;

/**
 * Simple Java program for Student Grade System
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Student
{	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int reg_no,m1,m2,m3,m4,m5,tot;
		double avg;
		String st_name,result;
		boolean ch;
		
		System.out.println("STUDENT GRADE SYSTEM");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("Enter the Register no:");
		reg_no=sc.nextInt();
		System.out.println("Enter Student name:");
		st_name=sc.next();
		System.out.println("Enter Tamil mark:");
		m1=sc.nextInt();
		System.out.println("Enter English mark:");
		m2=sc.nextInt();
		System.out.println("Enter Maths mark:");
		m3=sc.nextInt();
		System.out.println("Enter Science mark:");
		m4=sc.nextInt();
		System.out.println("Enter Social mark:");
		m5=sc.nextInt();
		
		tot=m1+m2+m3+m4+m5;
		avg=tot/5;
		
		System.out.println("Reg.NO		 :"+reg_no);
		System.out.println("Student Name :"+st_name);
		System.out.println("Tamil		 ="+m1);
		System.out.println("English          ="+m2);
		System.out.println("Maths		 ="+m3);
		System.out.println("Science  	 ="+m4);
		System.out.println("Social		 ="+m5);
		System.out.println("                  ---");
		System.out.println("Total		  "+tot);
		System.out.println("		  ---");
		System.out.println("Average		  :"+avg);
		
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35)
		{	result="PASS";
			System.out.println("Result 		  :"+result);
		}
		else
		{
			result="FAIL";
			System.out.println("Result		 :"+result);
		}
		
		if(result=="PASS")
		{
			if(avg>90)
			{
				System.out.println("GRADE		  :Excellent");
			}
			else if(avg>80)
			{
				System.out.println("GRADE		  :Very Good");
			}
			else if(avg>60)
			{
				System.out.println("GRADE		  :Good");
			}
			else if(avg>40)
			{
				System.out.println("GRADE		  :Average");
			}
			else
			{
				System.out.println("GRADE		  :Poor");
			}
		}
		else
		{
			System.out.println("GRADE		  :-");
		}
	
		
		System.out.println("Add Records(YES/NO)");
		ch=sc.nextBoolean();
	
		}while(ch);
	}
}
