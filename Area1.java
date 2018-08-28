package assignment4;

import java.util.Scanner;
public class Area1
{
	double len,breadth;
	double area;
	public Area1(double len,double breadth)
	{
		this.len=len;
		this.breadth=breadth;
		area=len*breadth;
	}
	public void func()
	{
		System.out.println("Area of rectangle :"+area);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rectangle :");
				double length=sc.nextDouble();
				System.out.println("Enter the breadth of a rectangle");
				double width=sc.nextDouble();
				Area1 obj=new Area1(length,width);
				obj.func();
			sc.close();	
	}
	
}