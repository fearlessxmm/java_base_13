package com.lenmon.base.day04.section01;

public class FunTester3 {

	public static void main(String[] args) {
		// 写一个函数：不定数量的数相加
		// 用一个容器将这些数装起来：数组
		int[] arry = new int[3];
		arry[0] = 0;
		arry[1] = 1;
		arry[2] = 2;
		System.out.println(plus(arry));
	}

	private static int plus(int[] args) {
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
}
