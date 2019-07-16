package com.fairyland.mgr.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import static java.lang.System.out;
public class Dxc {
	public static void main(String[] args) throws Exception, Exception {
		MyThread myThread = new MyThread();
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
//		myThread.start();
//		myThread1.start();
//		myThread2.start();
		
		MyThreadRun myThreadR = new MyThreadRun();
		Thread thread = new Thread(myThreadR,"线程A");
		Thread thread1 = new Thread(myThreadR,"线程B");
		Thread thread2 = new Thread(myThreadR,"线程C");
//		thread.start();
//		thread1.start();
//		thread2.start();
		
		MyThreadCall myThreadCall = new MyThreadCall();
		FutureTask<String> futureTask = new FutureTask<String>(myThreadCall);
		Thread thread3 = new Thread(futureTask,"线程E");
		Thread thread4 = new Thread(futureTask,"线程F");
		Thread thread5 = new Thread(futureTask,"线程G");
		thread4.start();
		thread3.start();
		thread5.start();
		out.println(futureTask.get());
		System.out.println(futureTask.get());
	}
}
