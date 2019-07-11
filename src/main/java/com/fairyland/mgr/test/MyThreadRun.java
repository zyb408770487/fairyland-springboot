package com.fairyland.mgr.test;

public class MyThreadRun implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "----" + i);
		}
	}

}
