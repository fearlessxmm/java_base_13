package com.lenmon.base.day05.section04;

public class Investor extends Member{
	//投资人特有的方法，投资
	public void investor(double amount){
		System.out.println("投资了"+amount);
	}
	public void recharge(double amount){
		// 充值金额大于等于100，小于2000以内
		if(amount<100||amount>2000){//只要前面的条件满足就执行，也就是前面为true后面就不用判断了
			System.out.println("31：充值失败,当前余额为："+this.getAmount());
		}else{	
			//调用父类的设置输出方法
			this.setAmount(this.getAmount()+amount);
			//this.amount += amount;
			System.out.println("32：充值成功,当前余额为："+this.getAmount());
		}
	}
}
