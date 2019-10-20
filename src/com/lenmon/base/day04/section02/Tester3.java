package com.lenmon.base.day04.section02;

public class Tester3 {

	public static void main(String[] args) {
		// 比较java创建对象内存机制
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		// System.out.println(str1 == str2);
		// System.out.println(str2 == str3);
		// System.out.println(str3 == str4);
		// 将str3赋值给str4
		str4 = str3;
		System.out.println(str3 == str4);// true
	}

}
