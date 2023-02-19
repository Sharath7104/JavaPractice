package thread;
//Create a Multithreaded application to start 3 threads :
//
//- Salman Thread
//- Hritik Thread
//- Akshay Thread should be the main thread
//
//Salman thread will print the sum of the first 10 number
//
//Hritik thread will print the multiplication of the first 10 number
//
//Akshay thread will print its name 10 times.

class SalmanThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
}

class HritikThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long prod = 1;
		for(int i=1;i<=10;i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}
	
}

class AkshayThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName());
		}
	}
		
}

public class ThreadP1 {
	public static void main(String[] args) {
		SalmanThread st = new SalmanThread();
		HritikThread ht = new HritikThread();
		AkshayThread at = new AkshayThread();
		
		Thread t1 = new Thread(st);
		t1.start();
		
		ht.start();
		at.start();
	}
	
}
