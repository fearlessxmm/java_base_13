package com.lenmon.base.day05.section04;

public class Tester {

	public static void main(String[] args) {
		// 多态
		// 借款人
		Borrower bor = new Borrower();
		//借款人充值1000.0
		bor.recharge(1000.0);//22：充值成功,当前余额为：1000.0
		bor.recharge(200.0);//22：充值成功,当前余额为：1200.0
		bor.recharge(90.0);//21：充值失败,当前余额为：1200.0
					
		
		// 投资人
		Investor inv = new Investor();
		inv.recharge(2000.0);//32：充值成功,当前余额为：2000.0
		inv.recharge(200.0);//32：充值成功,当前余额为：2200.0
		inv.recharge(80.0);//31：充值失败,当前余额为：2200.0
	}

}
