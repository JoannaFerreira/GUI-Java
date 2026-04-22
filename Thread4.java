package teleaula02;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		for( int ct =0; ct < 10; ct++) {
		System.out.println(Thread.currentThread().getName());
			
		}
		
	}
	
	public static void main(String[] args) {
		Thread4 t = new Thread4();
		Thread thread1 = new Thread(t);
		thread1.setName("Thread 1");
		thread1.start();
		

		Thread thread2 = new Thread(t);
		thread2.setName("Thread 2");
		thread2.start();
		
	}
	

}
