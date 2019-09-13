package practice.Mutlithreading;

public class PrintDemo {

public void printCount() {
    try {
        for(int i = 5; i > 0; i--) {
           System.out.println("Counter   ---   "  + i );
        }
     } catch (Exception e) {
        System.out.println("Thread  interrupted.");
     }
  }
boolean flag = false;

public synchronized void Question() {
   if (flag) {
      try {
         wait();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
   System.out.println("ping");
   flag = true;
   notify();
}

public synchronized void Answer() {
   if (!flag) {
      try {
         wait();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   System.out.println("Pong");
   flag = false;
   notify();
}
}


