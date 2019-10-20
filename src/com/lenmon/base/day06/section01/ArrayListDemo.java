package com.lenmon.base.day06.section01;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		// api
		// 插入数据
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		// 获取某个数据
		System.out.println(list.get(1));// 3
		// 删除某个数据
		list.remove(3);
		// 获取长度
		int len = list.size();
		System.out.println(len);
		// 判空
		System.out.println(list.isEmpty());
		// 是否包含
		System.out.println(list.contains("c"));
		// 修改某个数据
		list.set(2, "bb");
		System.out.println(list.get(2));// bb

		System.out.println("================遍历=================");

		// ArrayList数组长度：size()而不是length()
		// 遍历ArrayList数组
		for (int i = 0; i < list.size(); i++) {
			// 不是数组不能list[i]
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println("=================forEach===================");
		// foreach：增强for循环
		for (String name : list) {
			System.out.println(name);

		}

	}

}
