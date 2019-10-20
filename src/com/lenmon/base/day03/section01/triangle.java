package com.lenmon.base.day03.section01;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 打印如下图案
		for (int i = 1; i <= 5; i++) {
			// System.out.println("我是" + i + "层");
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
