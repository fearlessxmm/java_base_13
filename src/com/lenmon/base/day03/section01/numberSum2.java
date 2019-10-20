package com.lenmon.base.day03.section01;

public class numberSum2 {

	public static void main(String[] args) {
		int sum = 0;
		// 3：写一段程序求1+2+3+...+999+1000的值
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
