package Anudip;

import java.util.Scanner;

public class TwoString {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); //string input
		System.out.println("Enter your two Strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		//System.out.println(str1.contains(str2));
		if(str1.contains(str2))
		{
			System.out.println("Its contain same String");
		}
		else
		{
			System.out.println("There is no.such String");
		}

}
}