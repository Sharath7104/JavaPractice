package thread;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this);
		synchronized(this) {
			try {
				System.out.println(1);
				notify();
				wait();
				System.out.println(3);
				notify();
				wait();
				System.out.println(5);
				notify();
				wait();
				System.out.println(7);
				
			}catch(InterruptedException ex) {
				ex.getMessage();
			}
		}
	}
	
	
	 public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		
		Thread t1 = new Thread();
		
		
		t1.setName("Rahul");
		System.out.println(t1.getName());
		
		System.out.println(t1);
		td.start();
		
		System.out.println(td);
		
		synchronized(td) {
			try {
				td.wait();
				System.out.println(2);
				td.notify();
				td.wait();
				System.out.println(4);
				td.notify();
				td.wait();
				System.out.println(6);
				td.notify();
				td.wait();
			}catch(InterruptedException ex) {
				ex.getMessage();
			}
		}
		
		try {
			td.join();
		}catch(InterruptedException ex){
			
		}
		
		System.out.println("Bye bye");
	}
	
}
