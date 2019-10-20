package com.lenmon.base.day05.section06;

public class Money {
	// 如果RMB是假钱、或者面额小于10块,或者不干净，鹦鹉都不会叼
	boolean type;
	boolean clean;
	double money;

	// 构造方法
	public Money(boolean type, boolean clean, double money) {
		this.type = type;
		this.clean = clean;
		this.money = money;
	}

	// set get
	public String getType() {
		if (this.type == false) {
			return "假钱";
		} else {
			return "真钱";
		}
	}

	public String getClean() {
		if (this.clean == false) {
			return "不干净的";
		} else {
			return "干净的";
		}
	}

	public String getMoney() {
		return "面额为" + this.money;
	}
}
