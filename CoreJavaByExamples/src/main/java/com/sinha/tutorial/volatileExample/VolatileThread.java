package com.sinha.tutorial.volatileExample;

/**
 * 
 * @author kishore
 *
 */
public class VolatileThread extends Thread {

	private VolatileData volatileData;
	
	
	public VolatileThread(VolatileData volatileData) {
		super();
		this.volatileData = volatileData;
	}

	public void run() {

		int oldVal = volatileData.getCounter();
		System.out.println("[Thread "+Thread.currentThread().getId()+"] : OldValue ="+oldVal);
		
		volatileData.incrementCounter();
		
		int newVal = volatileData.getCounter();
		System.out.println("[Thread "+Thread.currentThread().getId()+"] : NewValue ="+newVal);
	}

}
