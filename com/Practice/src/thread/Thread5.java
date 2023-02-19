package thread;


class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class Thread5 {

	public static void main(String[] args) {
		Thread1 one = new Thread1();
		Thread2 two = new Thread2();
		Thread t1 = new Thread(one, "FirstThread");
		t1.start();
		
		Thread t2 = new Thread(two, "SecondThread");
		t2.start();
	}
}
