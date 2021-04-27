package lineComparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1,x2,x3,x4,y1,y2,y3,y4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Co-ordinates of 1st Line");
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter the  Co-ordinates of 2nd Line");
		x3=sc.nextInt();
		x4=sc.nextInt();
		y3=sc.nextInt();
		y4=sc.nextInt();
		int a=(x2-x1);
		int b=(y2-y1);
		a=a*a;
		b=b*b;
		int  c=a+b;
		Integer length1= (int)Math.sqrt(c);
		System.out.println(length1);
		int d=x4-x3;
		int e=y4-y3;
		d=d*d;
		e=e*e;
		int f=d+e;
		Integer length2= (int)Math.sqrt(f);
		System.out.println(length2);
	
		if (length1.equals(length2))
		{
			System.out.println("Both Lines are Equals");
		}
		else
		{
			System.out.println("BOth Lines are not equal");
		}



	}

}
