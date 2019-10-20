package com.lenmon.base.day03.section01;

public class numberSum {

	public static void main(String[] args) {
		int oddSum = 0, evenSum = 0;
		// 2：写一段程序分别求出0到100之间所有的偶数的和以及奇数的和
		for (int i = 0; i <= 100; i++) {
			// 偶数
			if (i % 2 == 0) {
				evenSum += i;
			} else if (i % 2 == 1) {
				oddSum += i;
			}
		}
		System.out.println("奇数和" + oddSum);
		System.out.println("偶数和" + evenSum);
	}

}
