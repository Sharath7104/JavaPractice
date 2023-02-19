package areaofperimeter;

public class PerimeterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter pOne;
		pOne = new Perimeter();
		pOne.setValues(10,6);
		System.out.println("Area is "+ pOne.getValue());
		
		Perimeter pTwo = new Perimeter();
		pTwo.setValues(5, 6);
		System.out.println("Area is "+ pTwo.getValue());
	}
}
