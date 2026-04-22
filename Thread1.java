package teleaula02;

public class Thread1 extends Thread {
	
	public Thread1() {
		start();
		
	}
	
	public void run() {
		System.out.println("Minha primeira Thread");
	}
	
	public static void main(String[] args) {
		new Thread1();
	}
		
	
	
}
	
	



