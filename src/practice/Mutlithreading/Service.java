package practice.Mutlithreading;

import java.util.ArrayList;

public class Service {
	Boolean isColletionFull=false;
	ArrayList arrayList=new ArrayList();

	public synchronized void producer() throws InterruptedException {
		while(true) {
		if (isColletionFull) {
			wait();
		}
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
			System.out.println(Thread.currentThread().getName()+"        "+arrayList);
		}

		isColletionFull=true;
		
		notify();
	}
		
	}
	
	
	public synchronized void consumer() throws InterruptedException {
		while(true) {
		if (!isColletionFull) {
			wait();
		}
		for (int i = arrayList.size()-1; i >0; i--) {
			arrayList.remove(i) ;
			System.out.println(Thread.currentThread().getName()+"        "+arrayList);
		}

		isColletionFull=false;
		System.out.println(Thread.currentThread().getName()+"        "+arrayList);
		notify();
	}
	}
}
