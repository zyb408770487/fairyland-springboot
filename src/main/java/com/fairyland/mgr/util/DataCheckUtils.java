package com.fairyland.mgr.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheckUtils {
	public static void main(String[] args) {
		String s = "qwertyuiop[]\\,asdfghjkl;',zxcvbnm,./";
		System.out.println(s);
		System.out.println(containSpace("陈国昌"));
		boolean matches = "陈国昌".matches("^([a-zA-Z]*|[\\u4E00-\\u9FA5\\uf900-\\ufa2d]*)$");
		System.out.println(matches);
	}
	
	/**
	 * 验证字符串只能是中英文
	 * 
	 *
	 * @param name 需要校验的字符串
	 * @return 不包含返回true 包含返回false
	 * @author 周扬彬
	 */
	public static boolean containSpace(String name) {
	   Pattern pattern = Pattern.compile("^([a-zA-Z]*|[\\u4E00-\\u9FA5\\uf900-\\ufa2d]*)$");
	   Matcher matcher = pattern.matcher(name);
	   return matcher.matches();
	}
}
