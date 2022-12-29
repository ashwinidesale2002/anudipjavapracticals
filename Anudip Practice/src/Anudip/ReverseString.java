package Anudip;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String");
					//String str=sc.nextLine();
					//System.out.println("Change into uppercase="+str.toUpperCase());
		StringBuilder stb=new StringBuilder();
		stb.append(sc.nextLine());
		System.out.println(stb.reverse());
		String st=stb.toString();
		System.out.println("Change into upper case  ="+st.toUpperCase());
	 
}
}
