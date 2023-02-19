package practice;
import java.util.Scanner;
public class Human {
	private int age;
	
	
	
	void setAge(int age) {
		if(age<0 || age>120) {
			System.out.println("Enter correct details");
		}else {
			this.age = age;
		}
	}
	
	int getAge() {
		return this.age;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human h = new Human();
		System.out.println("Enter age");
		h.setAge(sc.nextInt());
		if(h.getAge()==0) {
			System.out.println();
		}else {
			System.out.println("Age is "+h.getAge());
		}
		
		sc.close();
	}
}