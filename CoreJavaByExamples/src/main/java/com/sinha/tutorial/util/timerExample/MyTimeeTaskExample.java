package com.sinha.tutorial.util.timerExample;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask is used to schedule task for future execution in a background thread.
 * It may be schecule for one-time execution or for repeated execution at regular intervals.
 * This is thread safe and multple thread can use single Timer object without need of external synchronization.
 * 
 * @author kishore
 *
 */
public class MyTimeeTaskExample extends TimerTask {

	@Override
	public void run() {

		System.out.println("Started Execution TimerTask at : "+new Date());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished Execution TimerTask at : "+new Date());
	}

	public static void main(String[] args) throws InterruptedException {

		TimerTask timerTask = new MyTimeeTaskExample();
		
		Timer timer = new Timer(true);
		//TimeTask schedules the specified task for repeated fixed delay of 5seconds.
		timer.schedule(timerTask, 0, 5000);
		
		System.out.println("Schedule for TimerTask has started");
		Thread.sleep(10000);
		System.out.println("Schedule for TimerTask has finished");
	}

}
