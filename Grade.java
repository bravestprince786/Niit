package assignment2.org;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the marks to get the result :");
		float marks=sc.nextFloat();
			if(marks<25)
			{
				System.out.println("failed and Grade is F");
				break;
			}
			else if(marks>=25 && marks<=45)
			{
				System.out.println("grade E");
				break;
			}
			else if(marks>=45 && marks<=50)
			{
				System.out.println("grade D");
				break;
			}
			else if(marks>=50 && marks<=60)
			{
				System.out.println("grade C");
				break;
			}
			else if(marks>=60 && marks<=80)
			{
				System.out.println("grade B");
				break;
			}
			else if(marks>80 && marks<=100)
			{
				System.out.println("grade A");
				break;
			}
			else
			{
				System.out.println("wrong marks entered please enter it again");
			}
			
		}
		sc.close();
	}

}
