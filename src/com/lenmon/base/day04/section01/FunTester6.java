package com.lenmon.base.day04.section01;

public class FunTester6 {

	public static void main(String[] args) {
		// 写一个函数：字符串拼接
		// 用一个容器将这些数装起来：数组
		plus("Hello", "World", "!");
	}

	private static void plus(String... args) {// 拓展数组jdk1.5新增
		// forEach javajdk1.5新增简化代码
		for (String item : args) {
			System.out.print(item);
		}
	}
}
