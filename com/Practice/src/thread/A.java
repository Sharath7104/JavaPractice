package thread;

public class A {
	public static void funA(){

		for(int i=1;i <=10; i++){

		System.out.println(Thread.currentThread().getName()+" is running");

		}

		}

		public void funB(){

		for(int i=20;i <=30; i++){

		System.out.println(Thread.currentThread().getName()+" is running");

		}

		}
		
		public static void main(String[] args) {
			A a = new A();
			Thread t1 = new Thread(A::funA);
			t1.setName("Dhoni");
			Thread t2 = new Thread(() -> a.funB() , "Kohli");
			
			t1.start();
			t2.start();
		}
}
