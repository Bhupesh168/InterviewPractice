package practice.Mutlithreading;

public class Thread2 extends Thread{
	private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   Thread2( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	
	public void run() {
	      for(int i=1;i<5;i++) {
	         PD.Answer();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	 public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }

}
}