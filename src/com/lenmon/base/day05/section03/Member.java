package com.lenmon.base.day05.section03;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Member {
	// 会员类
	// 属性
	private String phone;
	private String regName;
	private String password;
	private double amount;
	
	
	// set，get方法
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	
	public void setRegName(String regName){
		this.regName=regName;
	}
	public String getRegName(){
		return regName;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	// 注册
	public void register(String phone,String password){
		if(phone.length()==11&&password.length()==6){
			System.out.println("注册成功！");
		}else{
			System.out.println("注册失败！");
		}
	}	
	// 登录
	public void login(String phone,String password){
		if(phone.length()==11&&password.length()==6){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
		}
	}
	// 充值
	public void recharge(double amount){
		// 充值金额大于等于100，小于2000以内
		if(amount<100||amount>2000){//只要前面的条件满足就执行，也就是前面为true后面就不用判断了
			System.out.println("充值失败,当前余额为："+getAmount());
		}else{			
			this.amount += amount;
			System.out.println("充值成功,当前余额为："+getAmount());
		}
	}
}
