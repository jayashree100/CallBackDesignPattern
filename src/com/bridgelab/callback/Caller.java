package com.bridgelab.callback;

public class Caller implements Callback{
	Calle calle = new Calle(this);
	
	@Override
	public void notifyCaller() {
		System.out.println("Thank you calle executing My Task");
		System.out.println("Now i will take the Data  and Process");
	}
	
	public void calleAsynchronusTask() {
		calle.doAsynchronousTask();
	}
	
		}
	


