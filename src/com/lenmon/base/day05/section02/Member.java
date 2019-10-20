package com.lenmon.base.day05.section02;

public class Member {
	// 会员类
	// 属性
	String regName;
	private String phone;
	String password;
	
	// 设置电话号码
	public void setPhone(String phone){
		if(phone.length()==11){			
			this.phone=phone;
		}else{
			System.out.println("请输入11位！");
		}
	}
	
	// 获取电话号码
	public String getPhone(){
		return phone;
	}
	
	// 方法
	public void login(String phone,String password){
		if(phone.length()==11&&password.length()==6){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败");
		}
	}
}
