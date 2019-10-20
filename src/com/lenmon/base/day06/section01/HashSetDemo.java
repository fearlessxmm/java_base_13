package com.lenmon.base.day06.section01;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		// 添加数据add
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		// 获取长度
		System.out.println(set.size());
		// 判空
		System.out.println(set.isEmpty());
		// 是否包含某个数据
		System.out.println(set.contains("b"));
		// 将容器类转成数组，再遍历
		// length()是求String字符串对象中字符的个数，而length是求字符串数组中有多少个字符串。
		Object[] arr = set.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============================");
		// 删除某个数据
		set.remove("d");
		Object[] arr2 = set.toArray();
		for (Object object : arr2) {
			System.out.println(object);
		}
		System.out.println("===============================");
		// 清空
		set.clear();
		// 获取长度
		System.out.println(set.size());
	}

}
