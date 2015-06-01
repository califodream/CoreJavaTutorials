package com.sinha.tutorial.util.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This example illustrates how to use AtomicInteger class provided by "java.util.concurrent.atomic" package.
 * 
 * AtomicInteger class is wrapper for any int values allow to be updated automatically.
 * This support lock free and thread safe programming on single variables.
 * 
 * Most common use is to handle counter which will be access by different threads  simultaneously.
 * Below are few common APIs
 * 
 * incrementAndGet() -- The Value is incremented and its new value is returned. 
 * getAndIncrement() -- The Value is incremented but its previous value is returned.
 * addAndGet(int delta) -- The delta is added to the value and its new value is returned.
 * getAndAdd(int delta) -- The delta is added to the value but its previous value is returned.
 * compareAndSet(int expect, int update) -- The value is compared to expect param, and if they are equal 
 * 			then the value is set to update param and true is returned. 
 * 
 * We can also get int, long, float, double value from AtomicInteger variable, using intValue(), longValue(), floatValue().
 * 
 * @author kishore
 *
 */
public class AtomicIntegerExample {

	private static AtomicInteger atomicInt = new AtomicInteger(0);
	
	public static class MyRunnable implements Runnable {

		private int myCounter;
		private int myPrevCounter;
		private int myCounterPlusFive;
		private boolean isNine;
		
		public void run() {
			// TODO Auto-generated method stub
			myCounter = atomicInt.incrementAndGet();
			System.out.println("Thread "+Thread.currentThread().getName()+" / "+myCounter);
			myPrevCounter = atomicInt.getAndIncrement();
			System.out.println("Thread "+Thread.currentThread().getName()+" / "+myPrevCounter);
			myCounterPlusFive = atomicInt.addAndGet(5);
			System.out.println("Thread "+Thread.currentThread().getName()+" / "+myCounterPlusFive);
			isNine = atomicInt.compareAndSet(9, 3);
			if(isNine)
				System.out.println("Thread "+Thread.currentThread().getName()
						+" / Value was equal to 9, so it was updated to "+atomicInt.intValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}

}
