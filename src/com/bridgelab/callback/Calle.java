package com.bridgelab.callback;

public class Calle {
	private Callback callback;

	public Calle(Callback callback) {
	
		this.callback = callback;
	}
	
	public void doAsynchronousTask() {
		System.out.println("Do Asynchronus Task ");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		
		System.out.println("I am done with Asynchronus Task");
		callback.notifyCaller();

	}
}