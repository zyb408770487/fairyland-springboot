package com.fairyland.mgr.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private String host;
	private int port;
	private BufferedReader in;
	private PrintWriter out;
	private final static String charest = "gbk";
	private Scanner sc;
	private Socket socket;

	public Client(String host, int port) {
		this.host = host;
		this.port = port;
	}
	public void start() throws Exception{
		socket = new Socket(host, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream(),charest));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), charest)),true);		
		sc = new Scanner(System.in);
		Thread thread = new Thread(new Runnable() {
			public void run() {
				String s;
				try {
					while ((s=in.readLine())!=null) {
						System.out.println(s);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		while(true) {
			String str = sc.nextLine();
			out.println(str);
		}
	}
	public static void main(String[] args) throws Exception {
		new Client("192.168.8.165", 99).start();
	}
}
