package lambda;

@FunctionalInterface
interface Intr1 {
	void sayHello(String name);
}

@FunctionalInterface
interface Intr2 {
	void printName(String name);
	
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
//		Intr1 intrOne =  name -> System.out.println("Hello " + name);
//		intrOne.sayHello("Sharath");
		
		Intr2 intrTwo = (String name) -> {
			System.out.println("Hello " + name);
			
		};
		
		intrTwo.printName("Sowmya");
		
		Intr2.printMessage("Sharath");
		
	}
}
