package multithreading;

public class Producer extends Thread{
	SharedResource p;
	Producer(SharedResource t){
		super("ProducerThread");
		this.p=t;
		
	}
	
	public void run() {
		while(true) {
		try {
			p.producer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
