package com.lenmon.base.day03.section02;

public class FunTester {

	public static void main(String[] args) {
		// 抽取方法
		// 3：使用switch结构实现为小明定制学习计划，星期一、星期三、星期五学习编程，星期二、星期四、星期六学习英语，星期日休息
		String day = "星期日";
		String day1 = "星期二";
		getDay(day);
		getDay(day1);
	}

	private static void getDay(String day) {
		switch (day) {
		case "星期一":
		case "星期五":
		case "星期三":
			System.out.println("学习编程");
			break;
		case "星期二":
		case "星期四":
		case "星期六":
			System.out.println("学习英语");
			break;
		case "星期日":
			System.out.println("休息");
			break;
		default:
			System.out.println("非法字符");
			break;
		}
	}

}
