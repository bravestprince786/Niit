package assignment4;
import java.util.Scanner;
public class Average {
	int a,b,c;
	double average;
	public void setAvg(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		average=(a+b+c)/3;
	}
	public void getAvg()
	{
		System.out.println("Average of a number :"+average);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number :");
			int a=sc.nextInt();
			System.out.println("enter the second number :");
			int b=sc.nextInt();
			System.out.println("enter the third number :");
			int c=sc.nextInt();
			
			Average obj=new Average();
			obj.setAvg(a, b, c);
			
			obj.getAvg();
			sc.close();
	}

}
