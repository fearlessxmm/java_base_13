package com.lenmon.base.day05.section05;

public class Investor extends Member{
	//投资人特有的方法，投资
	public void investor(double amount){
		System.out.println("投资了"+amount);
	}
	public boolean recharge(double amount){//因为使用多态，要重写父类的方法
		boolean flag = super.recharge(amount);
		// 充值金额大于等于100，小于2000以内
		if(flag){
			System.out.println("3:充值成功,可以去投资了！");
			return true;
		}else{				
			return false;
		}
	}
}
