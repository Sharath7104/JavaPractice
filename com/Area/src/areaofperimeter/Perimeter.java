package areaofperimeter;

public class Perimeter {
	double length;
	double breadth;
	
	void setValues(double l, double b) {
		length = l;
		breadth = b;
	}
	
	double getValue() {
		return length*breadth;
	}
}
