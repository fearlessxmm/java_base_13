package com.lenmon.base.day06.section01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		// 添加数据
		map.put("name", "LiMing");
		map.put("age", "12");
		map.put("sex", "female");
		// 根据键值，获取数据
		System.out.println(map.get("name"));

		System.out.println("=====================================");
		// 获取所有键
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("=====================================");
		// 获取所有的值
		Collection<String> values = map.values();
		for (String val : values) {
			System.out.println(val);
		}

		// 获取长度
		System.out.println(map.size());

		System.out.println("=====================================");
		// 是否包含键或值
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue("12"));
	}

}
