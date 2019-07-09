package com.fairyland.mgr.test;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}

