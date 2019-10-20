package com.lenmon.base.day04.section02;

public class Tester4 {

	public static void main(String[] args) {
		int aInt = 10;
		// 装箱
		Integer i = new Integer(20);
		// 拆箱
		System.out.println(i.intValue());
		// 自动装箱
		Integer d = aInt;
		// 自动拆箱
		int f = new Integer(30);
		System.out.println(f);
	}

}
