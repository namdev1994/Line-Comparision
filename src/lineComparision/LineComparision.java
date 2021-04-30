package lineComparision;

import java.util.Scanner;

public class LineComparision {
	static Double length1=0d;
	static Double length2=0d;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		//object Creation
		LineComparision l1=new LineComparision();
		//method call using object
		l1.lengthCalculation();
		//equal method call using object
		l1.UsingEqualsMethod();
		//CompareTo method call using object
		l1.UsingCopareToMethod();
	}
		
		//length Calculation
		public static void lengthCalculation()
		{
			double x1,x2,x3,x4,y1,y2,y3,y4;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1=sc.nextDouble();
			x2=sc.nextDouble();
			y1=sc.nextDouble();
			y2=sc.nextDouble();
			length1=Math.sqrt((x2 - x1)*(x2 - x1) + (y2 -y1)*(y2 -y1));
			System.out.println("Length of Line 1 = "+length1);
			System.out.println("Enter the  Co-ordinates of 2nd Line");
			x3=sc.nextDouble();
			x4=sc.nextDouble();
			y3=sc.nextDouble();
			y4=sc.nextDouble();
			 length2=Math.sqrt((x4 - x3)*(x4 - x3) + (y4 -y3)*(y4 -y3));
			System.out.println("Length of Line 2 = "+length2);
			
		}
		public static void UsingEqualsMethod()
		{
			if(length1.equals(length2))
			{
				System.out.println("The length of line are equals");
			}
			else
			{
				System.out.println("The length of line are different");
			}
		}
		public static void UsingCopareToMethod()
		{
			int check=length1.compareTo(length2);
			if(check == 0)
			{
				System.out.println("The length of line are equals");
			}
			else if(check > 0)
			{
				System.out.println("The length of line 1 is greater than Second");
			}
			else
			{
				System.out.println("The length of line 2 is greater than Frist");
			}
			
		}
		
		

}
