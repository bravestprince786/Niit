package assignment2.org;
import java.util.Scanner;
public class Purchase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the total amount :");
		//int amt=sc.nextInt();
		System.out.println("Enter the Quantity :");
		int qnty=sc.nextInt();
		float amt=qnty*100;
		float final_bill=0f;
		if(amt>=1000)
		{
			final_bill=amt-((amt*10)/100);
			System.out.println("total purchased amount :"+final_bill);
		}
		else
		{
			System.out.println("purchase more quantity to get the discount");
		}
		sc.close();
	}

}
