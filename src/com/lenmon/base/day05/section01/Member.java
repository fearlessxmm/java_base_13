package com.lenmon.base.day05.section01;

public class Member {
	// （3）定义一个会员类（Member），该类有三个属性：用户名regName，手机号码mobilePhone，可用余额leaveAmount
	String regName;
	String mobilePhone;
	String leaveAmount;

	public Member() {
		// 无参构造函数
	}

	public Member(String regName, String mobilePhone, String leaveAmount) {
		// 带参构造函数
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.leaveAmount = leaveAmount;
	}

	// 编写main函数
	public static void main(String[] args) {
		// 在main函数里调用无参构造函数来创建一个会员对象tom
		Member tom = new Member();
		tom.regName = "tom";
		System.out.println(tom.regName);
		// 在main函数里调用带参构造函数来创建一个学生对象jack
		Member jack = new Member("jack", "13425452855", "1222");
		// 在带参构造函数中使用各参数初始化对应属性的值
		System.out.println(jack.regName);
		System.out.println(jack.mobilePhone);
		System.out.println(jack.leaveAmount);
	}

}
