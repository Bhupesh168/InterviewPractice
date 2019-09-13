package multithreading;

public class Consumer extends Thread {
	SharedResource s;
Consumer(SharedResource s){
	super("ConsumerThread");
	this.s=s;
	
	
}

public void run() {
	while(true) {
	try {
		s.consumer();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
