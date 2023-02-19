package practice;
import java.util.Scanner;
public class Rectangle {
	  double length;
	  double breadth;
	  Rectangle() {
	    System.out.println("Inside constructor");
	    length = 10.0;
	    breadth = 15.0;
	  }
	  double getArea() {
	    double area = length * breadth;
	    return area;
	  }
	public static void main(String[] args) {
		 Rectangle rectOne = new Rectangle();
		    System.out.println("Area of rectOne is " + rectOne.getArea());
		    Rectangle rectTwo = new Rectangle();
		    System.out.println("Area of rectTwo is " + rectTwo.getArea());
	}

}
