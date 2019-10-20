package com.lenmon.base.day04.section02;

public class Tester2 {

	public static void main(String[] args) {
		// 注册一个用户，手机号为13475849555，密码为123456,
		// 创建一个Member对象
		// 类名 对象名=new 类名();
		// Member stu = new Member();// 这里new一个对象的时候会调用无参构造函数
		Member stu2 = new Member("stu2");// 这里new一个对象的时候会调用有参构造函数
		System.out.println(stu2.regName);

		// 访问属性
		// System.out.println(stu.passWord);
		// 注册(调用对象方法)
		// stu.register("13475849555", "123456");
		// stu.login("13475849555", "123456");
	}

}
