package com.lenmon.base.day04.section01;

public class FunTester5 {

	public static void main(String[] args) {
		// 写一个函数：字符串拼接
		// 用一个容器将这些数装起来：数组
		System.out.println(plus("Hello", "World", "!"));
	}

	private static String plus(String... args) {// 拓展数组jdk1.5新增
		String result = "";
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
}
