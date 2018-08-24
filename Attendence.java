package assignment2.org;
import java.util.Scanner;
public class Attendence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float percent=0f;
		while(true)
		{
			System.out.println("Enter the number of class that you have attended :");
			int class_attended=sc.nextInt();
			System.out.println("Enter the number of total class :");
			int total_class=sc.nextInt();
			percent=((class_attended/total_class)*100);
			if(percent>75)
			{
				System.out.println("You are allowed to the class to attend the lecture :"+percent);
				break;
			}
			else
			{
				System.out.println("You are not allowed to attend the class"+percent);
				System.out.println();
				System.out.println("Want to continue :");
			}
			
		}
		sc.close();
		
	}

}
