package assignment4;
class Detail
{
	double side1,side2,side3;
	double area,perimeter;
	public Detail()
	{
		side1=34;
		side2=23;
		side3=435;
		area=side1*side2*side3;
		perimeter=side1+side2+side3;
		
	}
	public void display()
	{
		System.out.println("Area of triangle :"+area);
		System.out.println("Area of triangle :"+perimeter);
	}
}
public class Answer4 {

	public static void main(String[] args) {
		Detail obj=new Detail();
		obj.display();
	}

}
