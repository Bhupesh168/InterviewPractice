package multithreading;

import java.util.concurrent.Semaphore;

public class SemaPhoreExample {
	
	
	Semaphore s = new Semaphore(2,true);
	
	public void print() throws InterruptedException {
		s.acquire();
		System.out.println("Ping");
		s.release();
		
		
	}

}
