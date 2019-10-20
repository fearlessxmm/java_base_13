package com.lenmon.base.day03.section02;

public class pushDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2：小朋友搬桌子:
		// 如果年龄大于7岁,提示可以搬动桌子
		// 如果年龄大于5岁,性别是男, 提示可以搬动桌子
		// 否则不可以搬动桌子，提示你还太小了
		int age = 6;
		char sex = '女';
		if (age > 7) {
			System.out.println("可以搬动桌子");
		} else if (age > 5 && age <= 7 && sex == '男') {
			System.out.println("可以搬动桌子");
		} else {
			System.out.println("你还太小了");
		}
	}

}
