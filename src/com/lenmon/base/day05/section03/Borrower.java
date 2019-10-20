package com.lenmon.base.day05.section03;

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
}
