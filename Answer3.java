package assignment4;
class Triangle
{
	int area,perimeter;
	 int side1,side3,side2;
	public Triangle(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side3=side3;
		this.side2=side2;
		area=side1*side2*side3;
		perimeter=side1+side2+side3;
	}
	public void display()
	{
		System.out.println("Area of Triangle :"+area+"\n"+"Area of perimeter :"+perimeter);
	}
	
}
public class Answer3 {
	public static void main(String[] args) {
		Triangle obj=new Triangle(3,4,5);
		obj.display();

	}

}
