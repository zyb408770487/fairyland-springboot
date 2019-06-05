package com.fairyland.mgr.controller;

import com.fairyland.mgr.entity.BaseResponse;

public class JavaBcsx4 {
	public static void main(String[] args) {
		int a= 1, b =2, c=3;
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		BaseResponse base1 = new BaseResponse();
		BaseResponse base2 = new BaseResponse();
		base1 = base2;
		base1.setCode("1");
		base2.setCode("2");
		base1.setMessage("base Message");
		System.out.println(base1);
		System.out.println(base2);
	}
}
