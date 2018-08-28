package assignment4;
import java.util.*;
public class Employee {
	double sal,hours;
	private double total_sal;
	public void getInfo(String name,double sal,double hours)
	{
		this.sal=sal;
		this.hours=hours;
		System.out.println("\n=========================================\n");
		System.out.println("Entered name of an employee :"+name);
		System.out.println("Entered salary :"+sal+"\n"+"entred working hours"+hours);
	}
	public void AddSal()
	{
		if(sal<=500)
		{
			total_sal=10+sal;
			System.out.println("\n=========================================\n");
			System.out.println("total salary of the employee if their salary is less than $500 :"+total_sal);
		}
		
	}
	public void Addwork()
	{
		if(hours>6)
		{
			total_sal=5+sal;
			System.out.println("\n=========================================\n");
			System.out.println("total salary of the employee if their working hours is more than 6 per day :"+total_sal);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the empployee :");
		String name=sc.next();
		System.out.println("enter the salary of the employee");
		double sal=sc.nextDouble();
		System.out.println("enter the  number of hours of work per day of employee ");
		Double hours=sc.nextDouble();
		
		Employee obj=new Employee();
		obj.getInfo(name,sal,hours);
		obj.AddSal();
		obj.Addwork();
		
		sc.close();
	}	

}
