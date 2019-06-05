package com.fairyland.mgr.test;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESTest {
	
	public static void main(String[] args) throws Exception {
		String str = "唐俊祥";
		String key = "asdfghjklzxcvbnm";
		byte[] aesEncrypt = aesEncrypt(str,key);
		System.out.println("对学弟进行加密: "+aesEncrypt);
		
		String aesDecrypt = aesDecrypt(aesEncrypt,key);
		System.out.println("对学弟进行解密: "+aesDecrypt);
	}
	
	 /**使用AES对字符串加密
     * @param str utf8编码的字符串
     * @param key 密钥（16字节）
     * @return 加密结果
     * @throws Exception
     */
    public static byte[] aesEncrypt(String str, String key) throws Exception { 
           if (str == null || key == null) return null; 
           Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
           cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes("utf-8"), "AES")); 
           byte[] bytes = cipher.doFinal(str.getBytes("utf-8")); 
           return  bytes;
       } 
    
    /**使用AES对数据解密
     * @param bytes utf8编码的二进制数据
     * @param key 密钥（16字节）
     * @return 解密结果
     * @throws Exception
     */
       public static String aesDecrypt(byte[] bytes, String key) throws Exception { 
           if (bytes == null || key == null) return null; 
           Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
           cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes("utf-8"), "AES")); 
           bytes = cipher.doFinal(bytes);
           return new String(bytes, "utf-8"); 
       } 

}
