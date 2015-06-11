package com.sinha.tutorial.volatileExample;

/**
 * 
 * @author kishore
 *
 */
public class VolatileData {

	private volatile int counter;
	
	public int getCounter() {
		return counter;
	}
	
	public void incrementCounter() {
		++counter;
	}
}
