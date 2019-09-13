package practice.Mutlithreading;

public class MutliThread extends Thread {
	String name;
	MutliThread(String name){
		this.name=name;
		
	}
	
	public void run() {
		
		for(int i=0 ;i <5;i++) {
			
			System.out.println(name +"  PING");
			System.out.println ("Thread " + 
	                Thread.currentThread().getId() + 
	                " is running"); 
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MutliThread mul=new MutliThread("Thread-1");
		MutliThread mul1=new MutliThread("Thread-2");
		
		mul.run();
		mul.join();
		mul1.start();
		
		
		
		
		
	}
	

}
