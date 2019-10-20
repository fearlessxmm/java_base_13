package com.lenmon.base.day04.section02;

public class Member {
	// 定义一个Member类，作为模板
	// 属性（成员变量）
	String regName;
	String passWord;
	String phoneNumber;

	// public Member(String regName, String passWord, String phoneNumber) {
	// super();
	// this.regName = regName;
	// this.passWord = passWord;
	// this.phoneNumber = phoneNumber;
	// }
	//
	// public Member(String regName, String passWord, String phoneNumber, boolean
	// flag) {
	// super();
	// this.regName = regName;
	// this.passWord = passWord;
	// this.phoneNumber = phoneNumber;
	// }

	// 显式声明一个无参构造函数，没有返回值或者可以理解为返回值是一个对象
	public Member() {
		System.out.println("1:调用了无参构造函数");
	}

	// 显式声明一个有参构造函数
	public Member(String regName) {
		this.regName = regName;// 将参数regName传给当前对象的regName属性作为属性值
		System.out.println("2:调用了有参构造函数");
	}

	// 行为（方法）
	public void register(String phoneNumbers, String passWord) {
		if (phoneNumber.length() == 11 && passWord.length() == 6) {
			System.out.println("注册成功！");
		} else {
			System.out.println("注册失败");
		}
	}

	public void login(String phoneNumber, String passWord) {
		if (phoneNumber.length() == 11 && passWord.length() == 6) {
			System.out.println("登录成功！");
		} else {
			System.out.println("登录失败");
		}
	}

}
