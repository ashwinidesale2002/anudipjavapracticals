package Anudip;

	interface Printable1
	{
		void show();	//this is abstract method in interface
	}
	interface Calculate
	{
		int calcu(int i);	//this is abstract method
	}
	class Cal_square implements Printable1,Calculate       //implements first method 
	{
		public void show()
		{
			System.out.println("Square of a Number is =");
		}
		
		public int calcu(int a)
		{
			return a*a;
		}
		
	}
	class Cal_cube implements Printable1,Calculate
	{
		public void show()
		{
			System.out.println("Cube of a Number is=");
		}
		public int calcu(int a)
		{
			return a*a*a;
		}
	}

public class Printable {

		public static void main(String[] args) {
			
			Cal_square cq=new Cal_square();
			cq.show();
			System.out.println(cq.calcu(2));
			Cal_cube cc=new Cal_cube();
			cc.show();
			System.out.println(cc.calcu(3));	
			
		}

	}


