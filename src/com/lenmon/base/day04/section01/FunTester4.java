package com.lenmon.base.day04.section01;

public class FunTester4 {

	public static void main(String[] args) {
		// 写一个函数：不定数量的数相加
		// 用一个容器将这些数装起来：数组
		System.out.println(plus(1, 2, 3));
	}

	private static int plus(int... args) {// 拓展数组jdk1.5新增
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
}
