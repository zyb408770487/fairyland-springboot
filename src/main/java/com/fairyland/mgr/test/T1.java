package com.fairyland.mgr.test;

import org.apache.commons.lang3.StringUtils;

public class T1 {
	public static void main(String[] args) {
		String ids = "1,2,3,4";
		String idss = "6@7@8";
		for (String id : idss.split("@")) {
			if(StringUtils.isNotBlank(id)) {
				System.out.println(id);
			}
		}
		System.out.println("println idss");
	}
}
