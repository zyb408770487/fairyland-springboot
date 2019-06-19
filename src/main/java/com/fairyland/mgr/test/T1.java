package com.fairyland.mgr.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class T1 {
	public static void main(String[] args) {
		String idss = null;
		for (String id : idss.split("@")) {
			if(StringUtils.isNotBlank(id)) {
				System.out.println(id);
			}
		}
		System.out.println("println idss");
		
		String str = "aaa@445@5556@55";
		String[] split = str.split("@",4);
		for (String string : split) {
			System.out.println(string);
		}
		
		String str1 = "aaa";
		String str2 = "bbb";
		String str3 = "ccc";
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	}
	
	private int show() {
		int number = 10;
		if(number < 0) {
			System.out.println("<0");
			return number;
		}else if(number > 0) {
			System.out.println(">0");
			return number;
		}else if(number == 0){
			System.out.println("==0");
			return number;
		}else {
			return number;
		}
	}
}
