package assignment4;

public class Answer1 {

	private String name;
	private int roll_no;
	
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

	public static void main(String[] args) {
		Answer1 obj=new Answer1();
		obj.setName("John");
		obj.setRoll_no(2);
		
		System.out.println("Name of an employee :"+obj.getName()+"\n"+"Id of an Employee :"+obj.getRoll_no() );

	}

	
}


