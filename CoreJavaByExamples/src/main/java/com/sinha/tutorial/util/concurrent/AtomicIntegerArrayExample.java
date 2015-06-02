package com.sinha.tutorial.util.concurrent;

import java.util.concurrent.atomic.AtomicIntegerArray;


/**
 * Explanation provided in AtomicIntegerExample holds good here as well.
 * AtomicIntegerArray is an int array in which elements updated automatically.
 * 
 * addAndGet(int i, int delta) -- API method to add the given delta to the element at index i.
 * incrementAndGet(int i) -- API method, that increments by one the element at index i.
 * AtomicIntegerArray(int[] array) -- constructor to create a new AtomicIntegerArray object with the same length as, 
 * 		and all elements copied from, the given array.
 * compareAndSet(int i, int expect, int update) API method to set the element at position i to the given 
 * 		updated value if the current value is equal to the expected value.
 * 
 * 
 * @author kishore
 *
 */
public class AtomicIntegerArrayExample {

	private static AtomicIntegerArray integerArray = new AtomicIntegerArray(10);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		for (int i = 0; i < integerArray.length(); i++) {
			integerArray.set(i, 1);
		}
		
		Thread t1 = new Thread(new AddFive());
		Thread t2 = new Thread(new Increment());
		Thread t3 = new Thread(new InsertArray());
		Thread t4 = new Thread(new Compare());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("All threads are finished execution, AtomicInteger array's values are : ");
		for (int i = 0; i < integerArray.length(); i++) {
			System.out.println(i+"-"+integerArray.get(i));
		}
	}
	
	public static class AddFive implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < integerArray.length(); i++) {
				int addFive = integerArray.getAndAdd(i, 5);
				System.out.println("Thread "+Thread.currentThread().getId()+" / adding five at "
						+ i + " position value is "+addFive);
				System.out.println("Thread "+Thread.currentThread().getId()+" / array row is : "+integerArray);
			}
		}
	}
	
	public static class Increment implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < integerArray.length(); i++) {
				int add = integerArray.incrementAndGet(i);
				System.out.println("Thread "+Thread.currentThread().getId()+" / increasing at "
						+ i + " position value is "+add);
				System.out.println("Thread "+Thread.currentThread().getId()+" / array row is : "+integerArray);
			}
		}
	}
	
	public static class InsertArray implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < integerArray.length(); i++) {
				int[] myArray = new int[5];
				for (int j = 0; j < myArray.length; j++) {
					myArray[i] = 5;
				}
				integerArray = new AtomicIntegerArray(myArray);
				System.out.println("Thread "+Thread.currentThread().getId()+" Inserting new array, array now is "+integerArray);
			}
		}
	}
	
	public static class Compare implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < integerArray.length(); i++) {
				boolean isFive = integerArray.compareAndSet(i, 5, 3);
				System.out.println("Thread "+Thread.currentThread().getId()+" / comparing to 5, result is "+isFive+
						", so at "+ i + " position value is "+integerArray.get(i));
				System.out.println("Thread "+Thread.currentThread().getId()+" / array row is : "+integerArray);
			}
		}
	}

}
