package com.lenmon.base.day05.section03;

public class Tester {

	public static void main(String[] args) {
		// 继承
		// 借款人
		Borrower bor = new Borrower();
//		bor.setPhone("13798452444");
//		System.out.println(bor.getPhone());
//		bor.register("13799999999", "123456");// 注册成功
//		bor.login("13799999999", "123456");// 登录成功
//		bor.hasCar(true);// 设置有车
//		System.out.println(bor.isHasCar());// 有车
		//借款人充值1000.0
		/*bor.recharge(1000.0);//充值成功,当前余额为：1000.0
		bor.recharge(200.0);//充值成功,当前余额为：1200.0
		bor.recharge(90.0);//充值失败,当前余额为：1200.0
		*/		
		
		// 投资人
		Investor inv = new Investor();
		// 调用投资人特有的投资方法
		inv.investor(1000.0);//投资了1000.0
	}

}
