package com.fairyland.mgr.test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.script.DigestUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class T {
	
	public static String show() {
		System.out.println("ceshi github tijiao");
		System.out.println("ceshi github tijiao2");
		System.out.println("master版本,恶意修改");		
		int number1 = 1;
		switch (number1) {
		case 1:
			System.out.println("11111");
			return "11dfgh1";
		case 5:
			System.out.println("5555");
		case 2:
			System.out.println("222222");

		default:
			break;
		}
		return null;
	}
	public static void main(String[] args) {
		String show = show();
		System.out.println(show);
		String number;
//		System.out.println(number = "1");
//		System.out.println(number);
		String s = "qwerdf123";
		System.out.println(s);
		String string = UUID.randomUUID().toString();
		String sha1DigestAsHex = DigestUtils.sha1DigestAsHex(s);
		System.out.println(sha1DigestAsHex);
		System.out.println(string);
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		Integer integer = hashMap.get("thc_user");
		hashMap.put("thc_user", 1124);
		System.out.println(hashMap.get(integer));
		
		 JSONObject obj = new JSONObject();
	        obj.put("name", "John");
	        obj.put("sex", "male");
	        obj.put("age", 22);
	        obj.put("is_student", true);
	        obj.put("hobbies", new String[] {"hiking", "swimming"});
	        
	        Map<String, Object> data = new HashMap<String, Object>();
	        data.put("key", 1);
	        data.put("key5", "password");
	        data.put("key1", "username");
	        data.put("key3", "key33333");
	        data.put("key2", "password");
	        
	        JSONObject obj1 = new JSONObject(data);
	        System.out.println("obj1:" + obj1);
	        String string2 = obj1.getString("key1");
	        int intValue = obj1.getIntValue("key");
	        System.out.println(string2);
	        System.out.println(intValue);
	        
	        System.out.println(obj1);
	        String s11 = "PKgI+5SEUFHnoasocB7E0ddKJAJMgdIwKp3SHc1sHI2H16F7D+WL+vYjQpGK2rXWdFkMiozzcawfQKSi7P3C34OWA/TslcegAjdeJvJrEC8=";
	        //调用toString()方法可直接将其内容打印出来
	        System.out.println(obj.toString());
	        String s1 = "YTh0SrRZy6b6/LKhlrzWmHf9w96VVPLTNd1Tevgy0sDeaMjAhtcUTnf2NyLxVA8m9hLpKAdW8APg NCPdEG5WXmx9iyB/JBTLJiO43PRf0rerK51D+kZeXG3pMnssjf07yEqEEEQGkU6x03aI74xCyy4t VZ2Z5TRJnIqK/n0SAgUuHCKXEsbALbBBg01hc6i7NHHGjyQD2LVPLk3I+0SUJQ==";
	        String s2 = "2";
	        String s3 = "3";
	        String s4 = "4";
	        String s5 = "5";
			String student = "{\"id\":\""+ s +"\",\"name\":\"" + s1 +"\", \"age\":\""+ s2 + "\",\"gender\":\""+ s3 + "\", \"time\":\""+ s4 + "\" , \"type\":\"" + s5 +"\"}";
			String replace = student.replace(" ", ""); 
			System.out.println("-----------------------------------");
			System.out.println(student);
			System.out.println(replace);
			System.out.println("-----------------------------------");
			
			JSONObject object = JSON.parseObject(student);
			String jsonString = object.toJSONString();
			System.out.println(student);
			System.out.println(object);
			System.out.println(jsonString);
	}
}
