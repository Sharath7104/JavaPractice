package staticdemo;


public class StaticDemo {
	static {
		System.out.println("Inside static block");
	}
	
	static {
		System.out.println("Inside static block-2");
	}
	
	{
		System.out.println("Inside non-static block");
	}
	
	{
		System.out.println("Inside non-static block-2");
	}
	
	StaticDemo(){		
		System.out.println("Inside Constructor");
	}
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
	}
}
