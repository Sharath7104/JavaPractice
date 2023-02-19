package practice;

import java.util.Scanner;
import java.util.Arrays;

//Student details
public class Statickeyword {
	String name;
	int rollno;
	String address;
	static String institute;
	
	void setMethod() {
		rollno = 50;
		institute = "School"; //static can be accessed in non static block as well
	}
	
	static void staticmethod() {
//		rollno = 15; //non static variable cannot be accessed in static block
		institute = "Corp";
		System.out.println("Institute = "+institute);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 10;
		System.out.println(i);
		// TODO Auto-generated method stub
//		static int j = 20; // static cannot be a local variable
		
		Statickeyword st = new Statickeyword();
//		System.out.println(st.staticmethod());
		institute = "Masai"; //static variable can directly be accessible
		System.out.println(Statickeyword.institute);
//		name = "sharath"; // non static cannot be accessed directly
		staticmethod();
		System.out.println("sharath".compareToIgnoreCase("Sharath"));
		
		StringBuffer str = new StringBuffer("Technology");
		System.out.println(str.length());
		System.out.println(str.capacity());
		str.append("technologiesgoodbadnice");
		System.out.println(str.length());
		System.out.println(str.capacity());
		str.insert(10, "abcd");
		System.out.println(str);
		System.out.println(str.charAt(11));
		str.setCharAt(1,'A');
		System.out.println(str);
		str.delete(1, 5);
		System.out.println(str);
		str.delete(1, str.length());
		System.out.println(str);
		
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr[i].length;k++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
