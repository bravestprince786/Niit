package assignment2.org;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth of a rectangle :");
		int len,breadth;
		len=sc.nextInt();
		int area=0;
		breadth=sc.nextInt();
		while(len>0 && breadth>0)
		{
			if(len==breadth)
			{
				area=len*breadth;
				
			}
			else
			{
				System.exit(0);
			}
			
		}
		System.out.println(area);
		sc.close();
	}

}
