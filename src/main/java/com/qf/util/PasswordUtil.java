package com.qf.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordUtil {
public static String md5(String source, String salt, int hashIterations){
        //构造方法：第一个参数：散列算法 第二个参数：明文，原始密码 第三个参数：盐，通过使用随机数
        //第四个参数：散列的次数，比如散列两次，相当 于md5(md5(''))
        SimpleHash simpleHash = new SimpleHash("md5", source, salt, hashIterations);
        String md5 =  simpleHash.toString();
        return md5;
    }
    public static String md5(String source, String salt){
        return md5(source, salt, 1024);
    }
    public static String sha256(String source, String salt, int hashIterations){
        SimpleHash simpleHash = new SimpleHash("SHA-256", source, salt, hashIterations);
        String sha256 =  simpleHash.toString();
        return sha256;
    }
    public static String sha256(String source, String salt){
        return sha256(source, salt, 1024);
    }
    public static void main(String[] args) {
		String credentials = "123456";
		String salt = "user";
		int hashIterations = 1024;
		String md5 = md5(credentials,salt,hashIterations);
		System.out.println(md5);
	}
}
