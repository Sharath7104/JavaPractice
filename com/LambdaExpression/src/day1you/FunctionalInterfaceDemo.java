package day1you;


public class FunctionalInterfaceDemo {
	
	
	public static void main(String[] args) {
		
		Intr1 i1 = new Intr1() {

			@Override
			public void printName(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hi "+name);
			}
			
		};
		
		Intr1 i2 = n -> System.out.println("Hello " + n);
		
		i1.printName("Sharath");
		
		i2.printName("Sowmya");	
		
		
		Intr1 i3 = new IntrDemoClass();
		
		i3.printName("Sanoj");
		
		
		IntrDemoClass i4 = new IntrDemoClass();
		System.out.println(i4.namereturn("Sharath"));
		
	}
}
