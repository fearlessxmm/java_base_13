package com.lenmon.base.day04.section02;

public class Tester5 {

	public static void main(String[] args) {
		// 一般来说使用http协议（超文本传输协议）传输过来的都是字符串
		String a = "1000";
		int i = Integer.parseInt(a);
		System.out.println(i);

		String b = "10.3";
		double j = Double.parseDouble(b);
		System.out.println(j);
	}

}
