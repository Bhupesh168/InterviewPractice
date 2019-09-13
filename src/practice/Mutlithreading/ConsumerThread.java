package practice.Mutlithreading;

public class ConsumerThread extends Thread{
	
	String name;
	Service service;
	
	ConsumerThread(String name,Service service){
		this.name=name;
		this.service=service;
		
	}
	
	public void run() {
		try {
			service.consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void start() {
		
	Thread t = new Thread(this,name);
	t.start();
	}

}
