package multithreading;

public class MainClass {

	public static void main(String [] args) {
		SharedResource s = new SharedResource();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		p.start();
		c.start();
	}
	
}
