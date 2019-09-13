package multithreading;

public class SharedResource {
	
	Boolean b = true;

	public  synchronized void producer() throws InterruptedException {
		if(!b) {
			wait();
		}
	
	System.out.println(Thread.currentThread().getName()+"   "+"Ping");
	notify();
	b=false;
	}

	
	public synchronized void consumer() throws InterruptedException {
		
		if(b) {
			wait();
		}
		System.out.println(Thread.currentThread().getName()+"   "+"Pong");
		notify();
		b=true;
	}
}
