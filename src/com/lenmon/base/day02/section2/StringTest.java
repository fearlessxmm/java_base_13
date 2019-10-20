package com.lenmon.base.day02.section2;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组:数据类型 数组名称[] = null;(声明)
		// 数组名称=new 数组类型[长度];(实例化数组)
		// 数据类型[] 数组名称 = new 数组类型[长度];
		int[] ages = new int[65];
		// 数据类型 数组名称[] = new 数组类型[长度];
		int ages1[] = new int[65];
		// 1. 设置数据
		// 第一个同学的年龄
		ages[0] = 18;
		ages[1] = 16;
		ages[2] = 15;
		ages[64] = 15;
		
		// 2.取值
		System.out.println(ages[0]);
		// 第四个数没有赋值，默认值为0
		System.out.println(ages[3]);// 引用数据类型默认值为null，基本数据类型默认值为0
	}

}
