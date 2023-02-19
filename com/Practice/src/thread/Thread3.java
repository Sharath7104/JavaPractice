package thread;


class ThreadPrint implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	
	}
	
}

public class Thread3 {
	public static void main(String[] args) {
//		ThreadPrint t = new ThreadPrint();
		
		Thread t1 = new Thread(new ThreadPrint());
		t1.setName("FirstThread");
		t1.start();
		Thread t2 = new Thread(new ThreadPrint());
		t2.setName("SecondThread");
		
//		t1.start();
		t2.start();
	}
}
