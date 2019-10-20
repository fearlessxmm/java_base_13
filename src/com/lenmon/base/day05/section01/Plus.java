package com.lenmon.base.day05.section01;

public class Plus {

	public static void main(String[] args) {
		// （2）定义一个类、定义一个方法用来计算1+2+3+4+...+n的值，在main方法中调用方法，计算n=200时的值
		System.out.println(plus(200));
	}

	private static int plus(int num) {// 要在主方法中调用plus方法要加static，因为主方法是静态方法，要在静态方法中调用方法1，方法1必须是静态
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}
