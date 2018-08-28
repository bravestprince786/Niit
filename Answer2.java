package assignment4;
class Details
{
	private String name;
	private int roll_no;
	private long mobile_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	
}

public class Answer2 {

	public static void main(String[] args) {
		Details obj=new Details();
		Details obj1=new Details();
		obj.setMobile_no(1234567455);
		obj.setRoll_no(123);
		obj.setName("Sam");
		obj1.setMobile_no(1234567890);
		obj1.setName("John");
		obj1.setRoll_no(345);
		
		System.out.println("Name :"+obj.getName()+"\n"+"Roll no. :"+obj.getRoll_no());
		System.out.println("mobile no :"+obj.getMobile_no());
		System.out.println("Name :"+obj1.getName()+"\n"+"Roll no. :"+obj1.getRoll_no());
		System.out.println("mobile no :"+obj1.getMobile_no());
	}

}
