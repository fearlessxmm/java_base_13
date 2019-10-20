package com.lenmon.base.day02.section2;

public class ArrayTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建二维数组 
//		请使用两种语法来创建数组，数组的元素为{{“第一个”,”二维”},{“数”,”组”}} 
		//1.动态创建二维数组
		String[] str1 = {"第一个","二维"};
		String[] str2 = {"数","组"};
		String[][] str = new String[2][2];
		str[0] = str1;
		str[1] = str2;
		//2.静态创建二维数组
		String[][] str3 = {
				{"第一个","二维"},
				{"数","组"}
		};
//		请使用两种语法来创建数组，数组的元素为{{“第”,”二”},{“个”,”二”},{“维”,”数”,”组”}} 
		//1.动态创建二维数组
		String[][] str4 = new String[3][];
		String[] str5 = {"第","二"};
		String[] str6 = {"个","二"};
		String[] str7 = {"维","数","组"};
		str4[0] = str5;
		str4[1] = str6;
		str4[2] = str7;
		//2.静态创建二维数组
		String[][] str8 = {
				{"第","二"},
				{"个","二"},
				{"维","数","组"}
		};
//		请使用两种语法来创建数组，数组的元素为{{10,20},{30,40}} 
		//1.动态创建二维数组
		int[][] num = new int[2][2];
		int[] num1 = {10,20};
		int[] num2 = {30,40};
		num[0] = num1;
		num[1] = num2;
		//2.静态创建二维数组
		int[][] num3 = {
				{10,20},
				{30,40}
		};
//		请使用两种语法来创建数组，数组的元素为{{50,60},{70,80},{90,100,110}}
		//1.动态创建二维数组
		int[][] num4 = new int[3][];
		int[] num5 = {50,60};
		int[] num6 = {70,80};
		int[] num7 = {90,100,110};
		num4[0] = num5;
		num4[1] = num6;
		num4[2] = num7;
		//2.静态创建二维数组
		int[][] num8 = {
				{50,60},
				{70,80},
				{90,100,110}
		};
	}

}
