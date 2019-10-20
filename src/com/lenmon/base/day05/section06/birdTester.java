package com.lenmon.base.day05.section06;

public class birdTester {

	public static void main(String[] args) {
		/*
		 * 三：对如下场景进行编程
		 * 
		 * 动物园有鹦鹉表演的活动，鹦鹉很聪明，会叼钱，如果RMB是假钱、或者面额小于10块,或者不干净，鹦鹉都不会叼
		 * 
		 * 1：一只叫Tom的2岁的金刚鹦鹉，发现了一张干净的、面额为3块的假钱，它不屑的看了看
		 * 
		 * 2：一只叫Jack的1岁的虎皮鹦鹉，发现了一张干净的，面额为10块的真钱，它叼走了
		 */
		// 一只叫Tom的2岁的金刚鹦鹉
		Bird Tom = new Bird("Tom", 2, "金刚鹦鹉");
		// 一张干净的、面额为3块的假钱
		Money money1 = new Money(false, true, 3.0);
		getMoney(Tom, money1);

		// 一只叫Jack的1岁的虎皮鹦鹉
		Bird Jack = new Bird("Jack", 1, "虎皮鹦鹉");
		// 一张干净的，面额为10块的真钱
		Money money2 = new Money(true, true, 10.0);
		getMoney(Jack, money2);
	}

	// 叼钱判断方法
	public static void getMoney(Bird bird, Money money) {
		if (money.type == false || money.money < 10 || money.clean == false) {
			System.out.println(bird.name + "不叼" + money.getClean() + money.getMoney() + "的" + money.getType());
		} else {
			System.out.println(bird.name + "叼" + money.getClean() + money.getMoney() + "的" + money.getType());
		}
	}
}
