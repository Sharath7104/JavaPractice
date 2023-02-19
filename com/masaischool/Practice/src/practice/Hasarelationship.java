package practice;

public class Hasarelationship {
	
		int i;
		int j;
		
		Hasarelationship(int i, int j){
			this.i = i;
			this.j = j;
		}
	}

	class B{
		Hasarelationship ab;
		float f;
		
		B(Hasarelationship a, float f){
			this.ab  = a;
			this.f = f;
		}
		
	
	
	public static void main(String[] args) {
		Hasarelationship a = new Hasarelationship(10, 20);
		B b = new B(a, 10.5f);
		b.ab.i = 100; //reinitialize parent class instance variable
		System.out.println(b.ab.i + " " + b.ab.j);
		//10 20
	}

//	The object of class B has object of class A.
//	class B has-a relationship with class A.

	
}
