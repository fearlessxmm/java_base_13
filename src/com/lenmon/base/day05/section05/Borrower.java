package com.lenmon.base.day05.section05;

public class Borrower extends Member{
	// 借款人特有的属性
	private boolean hasCar;
	private boolean hasHome;
	// set get
	public void hasCar(boolean hasCar){
		this.hasCar=hasCar;
	}
	public boolean isHasCar(){
		return hasCar;
	}
	// 充值
	public boolean recharge(double amount){//因为使用多态，要重写父类的方法
		boolean flag = super.recharge(amount);
		// 充值金额大于等于100，小于2000以内
		if(flag){
			System.out.println("2:充值成功,可以去借款了！");
			return true;
		}else{				
			return false;
		}
	}
}
