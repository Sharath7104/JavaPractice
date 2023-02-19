package practice;

public class Thisstudent {
	int rollno;
	String name;
	double percentage;
	
	
	
	public Thisstudent() {
		rollno = 10;
		name = "Sharath";
		percentage = 40.0;
	}
	
	public Thisstudent(double percentage) {
//		super();
		this();
		this.percentage = percentage;
	}
	
	public Thisstudent(int rollno) {
		this();
		this.rollno = rollno;
	}

	void display() {
		System.out.println("Rollno = "+rollno +"\n" + "Name = "+ name);
		System.out.println("Percentage = "+ percentage);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisstudent stOne = new Thisstudent();
		
		stOne.display();
		
		Thisstudent stTwo = new Thisstudent(40.00);
		stTwo.display();
		
		Thisstudent stThree = new Thisstudent(15.00);
		stThree.display();
	}

}
