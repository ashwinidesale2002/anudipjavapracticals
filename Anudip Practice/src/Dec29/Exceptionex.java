/*Write a program take the input of age from the user if the age is above 18 print 'you are eligible to vote'else thrown an exception that 
 'age is not correct*/
package Dec29;

import java.util.Scanner;

public class Exceptionex {
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();	//taking age as input
		try
		{
		if(age>=18)			//checking  if age is greater than 18
			System.out.println("you are eligible ");
		else
			System.out.println("you are not eligible");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
