package com.lenmon.base.day05.section04;

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
		public void recharge(double amount){
			// 充值金额大于等于100，小于2000以内
			if(amount<100||amount>2000){//只要前面的条件满足就执行，也就是前面为true后面就不用判断了
				System.out.println("21：充值失败,当前余额为："+this.getAmount());
			}else{	
				//调用父类的设置输出方法
				this.setAmount(this.getAmount()+amount);
				//this.amount += amount;
				System.out.println("22：充值成功,当前余额为："+this.getAmount());
			}
		}
}
