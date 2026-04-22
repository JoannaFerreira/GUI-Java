package teleaula02;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		Thread2 t = new Thread2();
		Thread thread = new Thread(t);
		thread.start();
	}
	
}