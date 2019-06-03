package com.fairyland.mgr.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.FutureTask;

import com.fairyland.mgr.entity.User;
public class T1 {
	static {
		int a= 2;
	}
	public static void main(String[] args) {
		  //一维数组
        String [] str =new String[3];
                    str[0]="张三";
                    str[1]="李四";
                    str[2]="王五";
             // for形式遍历数组
              for(int i=0;i<str.length;i++){
                    System.out.println("一维数组:for:"+str[i]);
                }
            // 增强for形式  s遍历所有数组
             for(String s:str){
                            System.out.println("一维数组增强:for:"+s);
                 }
             
           //二维数组
             int[][] in = new int[2][3];
                   in[0][0]=1;
                   in[0][1]=2;
                   in[0][2]=3;
                   in[1][0]=4;
                   in[1][1]=5;
                   in[1][2]=6;
             //  for 形式
             for(int i1=0;i1<in.length;i1++){
                 for(int j=0;j<in[i1].length;j++){
                     System.out.println("二维数组：for:"+in[i1][j]);
                 }
               }
             //  增强  for形式
             for(int[] i2:in){
                 for(int k:i2){
                 System.out.println("二维数组：增强for:"+k);
                 }
             }
		Random random = new Random(100);
		System.out.println(random);
		System.out.println(random.nextInt(100));
		Integer arr = new Integer(random.nextInt(20));
		for (int i = 0; i < arr.SIZE; i++) {
		}
		System.out.println(arr);
		int a = 5;
		System.out.println(a);
		List<FutureTask<Map<String,Object>>> taskList = new ArrayList<FutureTask<Map<String,Object>>>();
		ThreadLocal<Object> threadLocal = new ThreadLocal<>();
		String s = new String("adsdf");
//		System.out.println(s.length());
//		BigDecimal bigDecimal = new BigDecimal("");
//		BigInteger bigIntger = new BigInteger("");
		System.out.println(s);
		String show = UserController.show();		System.out.println(show);
		TestController testController = new TestController();
		TestController testController2 = new TestController();
//		System.out.println(testController);
//		System.out.println(testController2.toString());
//		int a = TestController.a;
//		System.out.println(a);
//		System.out.println(new Date());
//		System.getProperties().list(System.out);
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("java.library.path"));
		boolean flag = true;
		Long number = 1L;
		float number1 = 139E-43f;
//		if(flag)
//			System.out.println(number +"====="+ number1);
//		else
//			System.out.println(number +"====="+ number1);
		int temp = 1;
//		for(;;) {
//			if(temp != 101) {
//				System.out.println(";; " + temp++);
//			}else {
//				break;
//			}
//		}
//		
	switch (2) {
		case 1:
			User user = new User();
			System.out.println("111111");
			break;
		case 2:
			System.out.println("222222");
			break;
		case 3:
			System.out.println("33333");
			break;

		default:
			break;
		}
		
	}
}
