package teleaula02;

public class Thread3 extends Thread {
	public void run() {
	System.out.println("Minha thread em java");
	System.out.println(Thread.currentThread().getName());
	//loop ate 500
	for (int ct = 0; ct < 500; ct++) {
		System.out.println("fazendo downloads");
	    
	    } 
    }

	public static void main(String[] args) {
		Thread3 t = new Thread3();
		t.setName("Thread 3");
		t.start();
		for(int ct = 0; ct<500; ct++) {
			System.out.println("Executando programa");
         }
	
     }
	
}