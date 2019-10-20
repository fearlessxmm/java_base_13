package com.lenmon.base.day05.section06;

public class Bird {
	/*
	 * 三：对如下场景进行编程
	 * 
	 * 动物园有鹦鹉表演的活动，鹦鹉很聪明，会叼钱，如果RMB是假钱、或者面额小于10块,或者不干净，鹦鹉都不会叼
	 * 
	 * 1：一只叫Tom的2岁的金刚鹦鹉，发现了一张干净的、面额为3块的假钱，它不屑的看了看
	 * 
	 * 2：一只叫Jack的1岁的虎皮鹦鹉，发现了一张干净的，面额为10块的真钱，它叼走了
	 */
	int age;
	String name;
	String type;

	// 构造方法
	public Bird(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

}
