package practice.Mutlithreading;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		 PrintDemo PD = new PrintDemo();

	      Thread1 T1 = new Thread1( "Thread - 1 ", PD );
	      Thread2 T2 = new Thread2( "Thread - 2 ", PD );

	      T2.start();
	      T1.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
		
		
		
	}


