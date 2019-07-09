package com.fairyland.mgr.test;

import java.util.concurrent.Callable;

public class MyThreadCall implements Callable<String>{
	private int ticket = 1000;
	@Override
	public String call() throws Exception {
		while (ticket > 0) {
			System.out.println(Thread.currentThread().getName() + "剩余数量：" + ticket--);
		}
		return "数量为零";
	}
}
