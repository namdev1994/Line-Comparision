package lineComparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		//method call
		lengthCalculation();
	}
	
	
	//method Implementation
		public static void lengthCalculation()
		{
			double x1,x2,x3,x4,y1,y2,y3,y4;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1=sc.nextDouble();
			x2=sc.nextDouble();
			y1=sc.nextDouble();
			y2=sc.nextDouble();
			double length=Math.sqrt((x2 - x1)*(x2 - x1) + (y2 -y1)*(y2 -y1));
			System.out.println("Length of Line = "+length);
		}
		
		

}
