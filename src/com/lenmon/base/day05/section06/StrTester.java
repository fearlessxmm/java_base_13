package com.lenmon.base.day05.section06;

public class StrTester {

	public static void main(String[] args) {
		// 字符串api
		String str = "Hello";
		// 判断是否以指定字符串开头或结尾 startsWith endsWith
		System.out.println("=======以指定字符串开头或结尾 startsWith endsWith===========");
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("H"));
		// 字符串截取 substring
		System.out.println("=======字符串截取 substring ===========");
		String str1 = str.substring(1);// 从下标1开始截取
		System.out.println(str1);
		String str2 = str.substring(1, 3);// 从下标1开始截取到3（不包括3），左闭右开
		System.out.println(str2);
		// 字符串拆分 split
		System.out.println("==========字符串拆分 split========");
		String[] strArr = str.split("");
		for (String str3 : strArr) {
			System.out.println(str3);
		}
		// 字符串查找 indexOf lastIndexOf contains
		System.out.println("==========字符串查找 indexOf========");
		System.out.println(str.indexOf("l"));
		System.out.println("==========字符串查找 lastIndexOf========");
		// 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
		System.out.println(str.lastIndexOf("l"));
		// 字符串比较 equals考虑大小写 equalsIgnoreCase
		// equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
		System.out.println("==========字符串比较 equals========");
		String testStr = new String("HellO");
		System.out.println(testStr.equals(str));
		// 字符串比较 equalsIgnoreCase
		System.out.println("==========字符串比较 equalsIgnoreCase========");
		String testStr1 = new String("HELLO");
		System.out.println(testStr1.equalsIgnoreCase(str));
		// 字符串拼接 concat
		System.out.println("==========字符串拼接 concat========");
		String testStr2 = "测试";
		str = str.concat(testStr2);
		System.out.println(str);
		// 判空 isEmpty
		System.out.println("==========判空 isEmpty========");
		System.out.println(str.isEmpty());
		// 去掉左右空格 trim
		System.out.println("==========去掉左右空格 trim========");
		String testStr3 = "     test ";
		System.out.println(testStr3.trim());
		// 字符串长度 length
		System.out.println("==========字符串长度 length========");
		System.out.println(str.length());
		// 转大小写 toUpperCase toLowerCase
		System.out.println("==========转大小写 toUpperCase toLowerCase========");
		System.out.println(testStr1.toUpperCase());
		System.out.println(testStr1.toLowerCase());
		// 替换 replace replaceFirst replaceAll
		// replace() 方法通过用 newChar 字符替换字符串中出现的所有 oldChar 字符，并返回替换后的新字符串。
		// replace(char oldChar,char newChar)
		System.out.println("==========替换 replace replaceFirst replaceAll========");
		System.out.println(str.replace('o', 'w'));

		/*
		 * replaceFirst(Stringregex,Stringreplacement) replaceFirst() 方法使用给定的参数
		 * replacement 替换字符串第一个匹配给定的正则表达式的子字符串
		 */
		String testStr4 = new String("hello runoob，I am from runoob。");
		System.out.print("返回值 :");
		System.out.println(testStr4.replaceFirst("runoob", "google"));
		System.out.print("返回值 :");
		System.out.println(testStr4.replaceFirst("(.*)runoob(.*)", "google"));
		;
		// 字符串描述 valueOfvalueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
		// 该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
		/*
		 * Integer valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例。
		 * 
		 * Integer valueOf(String s):返回保存指定的 String 的值的 Integer 对象。
		 * 
		 * Integer valueOf(String s, int radix): 返回一个 Integer
		 * 对象，该对象中保存了用第二个参数提供的基数进行解析时从指定的 String 中提取的值。
		 */
		Integer x = Integer.valueOf(9);
		Double c = Double.valueOf(5);
		Float a = Float.valueOf("80");

		Integer b = Integer.valueOf("444", 16); // 使用 16 进制

		System.out.println(x);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}

}
