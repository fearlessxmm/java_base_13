package com.lenmon.base.day02.section2;

public class ArrayTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建一维数组 
//		请使用两种语法创建数组，数组的元素为{“我”,”是”,”最”,”棒”,”的”} 
		// 1.动态创建数组
		String[] strings = new String[5];
		strings[0] = "我";
		strings[1] = "是";
		strings[2] = "最";
		strings[3] = "棒";
		strings[4] = "的";
		// 2.静态创建数组
		String[] strings2 = {"我","是","最","棒","的"};
//		请使用请使用两种语法创建数组，数组的元素为{100,200,300,400,500}
		// 1.动态创建数组
		int[] nums = new int[5];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		// 2.静态创建数组
		int[] nums1 = {100,200,300,400,500};
	}

}
