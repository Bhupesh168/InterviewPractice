package practice.Mutlithreading;

public class Main {
	public static void main(String [] args) {
		
		Service service = new Service();
		
		
		ConsumerThread consumerThread=new ConsumerThread("consumerThread",service);
		consumerThread.start();
		
		ProducerThread ProducerThread=new ProducerThread("ProducerThread",service);
		ProducerThread.start();
		
		
	}

}
