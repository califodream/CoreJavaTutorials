package com.sinha.tutorial.volatileExample;

/**
 * 
 * @author kishore
 *
 */
public class VolatileMainDemo {

	private final static int MAX_THREAD = 3;
	
	public static void main(String[] args) throws InterruptedException {

		VolatileData volatileData = new VolatileData();
		
		Thread[] threads = new Thread[MAX_THREAD];
		
		for (int i = 0; i < MAX_THREAD; i++) {
			threads[i] = new VolatileThread(volatileData);
		}
		
		for (int i = 0; i < MAX_THREAD; i++) {
			threads[i].start();;
		}
		
		for (int i = 0; i < MAX_THREAD; i++) {
			threads[i].join();
		}
	}
}
