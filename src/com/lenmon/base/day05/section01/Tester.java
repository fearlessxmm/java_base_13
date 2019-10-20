package com.lenmon.base.day05.section01;

public class Tester {

	public static void main(String[] args) {
		// 新建一个类:Tester 要求： 在Tester类调用计算器的加减乘除函数完成两个int类型数据的运算
		System.out.println("两数相加：" + Calculator.plus(1, 2));
		System.out.println("两数相减：" + Calculator.subtract(1, 2));
		System.out.println("两数相乘：" + Calculator.multiply(1, 2));
		System.out.println("两数相除：" + Calculator.divide(2, 1));
	}

}
