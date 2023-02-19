package thread;

class D extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class B extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

class C extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Thread4 {
	public static void main(String[] args) {
		D a = new D();
		B b = new B();
		C c = new C();
		
//		Thread t1 = new Thread(a, "First");
//		
//		Thread t2 = new Thread(b, "Second");
//		Thread t3 = new Thread(c, "Third");
		
		a.setName("First");
		b.setName("Second");
		c.setName("Third");
		a.start();
		b.start();
		c.start();
	}
}
