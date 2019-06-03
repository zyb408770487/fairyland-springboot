package com.fairyland.mgr.controller;

import java.util.Base64;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	public static void main(String[] args) throws Exception {
		boolean flag = false;
		if(flag) {
			System.out.println("1111");
		}else {
			System.out.println("2222");
//			throw new Exception();
		}
		
//		isNotEmpty ：
//		判断某字符串是否非空
		StringUtils.isNotEmpty(null); //= false;
		StringUtils.isNotEmpty(""); //= false
		StringUtils.isNotEmpty(" "); //= true
		StringUtils.isNotEmpty("bob"); //= true
//		isNotBlank：
//		判断某字符串是否不为空且长度不为0且不由空白符(whitespace)构成，
		StringUtils.isNotBlank(null); //= false
		StringUtils.isNotBlank(""); //= false
		StringUtils.isNotBlank(" "); //= false
		StringUtils.isNotBlank("\t \n \f \r"); //= false
		
		// jdk1.8支持
		String nickName = "☺";
		String encodeNickname = new String (Base64.getEncoder().encode(nickName.getBytes()),"utf-8");
		System.out.println("编码后："+encodeNickname);
		String decodeNickname = new String (Base64.getDecoder().decode(encodeNickname.getBytes()),"utf-8");
		System.out.println("解码后："+decodeNickname);
		// gbk解码
		String string = new String (Base64.getDecoder().decode(encodeNickname.getBytes()),"gbk");
//		System.out.println(string);
		
		// jdk1.7支持
        //BASE64编码  
//        String str = "hello";
//        byte[] bytes = str.getBytes("utf-8");
//        str = new sun.misc.BASE64Encoder().encode(bytes);
//        System.out.println("编码后...  "+str);
//        //BASE64解码
//        BASE64Decoder decoder = new BASE64Decoder();
//        byte[] b = decoder.decodeBuffer(str);
//
//        str = new String(b,"utf-8");
//        System.out.println("解码后... "  + str);
		}
}
