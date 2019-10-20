package com.lenmon.base.day06.section02;

import java.util.HashSet;

public class StuHashSet {

	public static void main(String[] args) {
		// 1).往这个HashSet对象里添加如下String类型的数据：“张三”，“李四”，“王五”，“张三”，”赵六”
		HashSet<String> stuSet = new HashSet<String>();
		stuSet.add("张三");
		stuSet.add("李四");
		stuSet.add("王五");
		stuSet.add("赵六");
		stuSet.add("王七");

		// 2).判断这个集合是否为空，并打印判断的结果。
		System.out.println(stuSet.isEmpty());
		// 3).打印这个集合的大小。
		System.out.println(stuSet.size());
		// 4).判断这个集合是否包含数据"王五"。
		System.out.println(stuSet.contains("王五"));
		// 5).将”张三”这条数据删掉。
		stuSet.remove("王五");
		// 6).利用迭代器迭代获取set集合中的每个元素，并打印。
		for (String stu : stuSet) {
			System.out.println(stu);
		}
		System.out.println("====================================");
		// 7).将set转换成数组。并循环打印数组中的元素
		Object[] stuArr = stuSet.toArray();
		for (Object stu : stuArr) {
			System.out.println(stu);
		}
	}
}
