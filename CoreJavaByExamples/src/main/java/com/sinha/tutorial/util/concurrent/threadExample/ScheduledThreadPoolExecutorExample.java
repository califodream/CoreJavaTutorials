package com.sinha.tutorial.util.concurrent.threadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * To avoid problem with TimerTask, use ScheduledThreadPoolExecutor, which can run more than 1 task in parallel.
 * Minimum pool of thread can be created while creating ScheduledThreadPoolExecutor.
 * 
 * ScheduledThreadPoolExecutor accept instance of either Runnable or Callable.
 * ScheduleFuture will return the Callable instance via get() method.
 * 
 * shutdownNow() Vs shutdown()
 * shutdown() -- indicates shutdown has been invoked on Executor and no new task will be added in DelayedPool. However, tasks already submitted will be allowed to complete.
 * shutdownNow() -- tries to kill the running task and stops all the processing of tasks, will return List that were awaiting execution.  
 * 
 * scheduleWithFixedDelay() vs scheduleAtFixedRate()
 * scheduleAtFixedRate() -- consider delay as the difference between the start of two tasks.
 * scheduleWithFixedDelay() -- consider delay as the difference between end of one task and start of next task.
 *  
 *   
 * @author kishore
 *
 */
public class ScheduledThreadPoolExecutorExample {

	static long currTime = System.currentTimeMillis();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable runnableDelayedTask = new Runnable() {
			
			public void run() {

				System.out.println(Thread.currentThread().getName()+" is running Delayed Task"+" , with delay : "+ (System.currentTimeMillis() - currTime)+" ms");
				currTime = System.currentTimeMillis(); 
			}
		};
		
		/**
		 * Another way of calling CallableTask is defined using inner class.
		 */
//		Callable<String> callableTask = new Callable<String>() {
//			
//			public String call() throws Exception {
//
//				return "Good Bye! See you at another invokation";
//			}
//		};
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
		
		//Below will start execution of RunnableDelayTask exactly after 1second and then runs with delay of 2 second. 
		executorService.scheduleWithFixedDelay(runnableDelayedTask, 1, 2, TimeUnit.SECONDS);
		
		//ScheduledFuture<String> scheduledFuture = executorService.schedule(callableTask, 4, TimeUnit.SECONDS);
		
		//Below will execute CallableTask at 8th second.
		ScheduledFuture<String> scheduledFuture = executorService.schedule(new CallableTask(), 8, TimeUnit.SECONDS);
		
		System.out.println("Callable Return : "+scheduledFuture.get() + ", After : "+(System.currentTimeMillis() - currTime)+" ms");
		
		executorService.shutdown();
		
		System.out.println("Is Executor Service shutdown? "+executorService.isShutdown());
		
	}
	
	/**
	 * CallableTask inner class which implements Callable.
	 * @author kishore
	 *
	 */
	public static class CallableTask implements Callable<String> {

		public String call() throws Exception {
			return "Good Bye! See you at another invokation";
		}
	}

}
