package com.lenmon.base.day05.section05;

public class Tester {

	public static void main(String[] args) {
		// 多态
		// 借款人
		Borrower bor = new Borrower();
		//借款人充值1000.0
		bor.recharge(1000.0);//12：充值成功,当前余额为：1000.0
							//2:充值成功,可以去借款了！
		System.out.println("--------");
		bor.recharge(90.0);//11：充值失败,当前余额为：1000.0
					
		System.out.println("--------");
		
		// 投资人
		Investor inv = new Investor();
		inv.recharge(2000.0);//12：充值成功,当前余额为：2000.0
							//3:充值成功,可以去投资了！
		System.out.println("--------");
		inv.recharge(80.0);//11：充值失败,当前余额为：2000.0
	}

}
