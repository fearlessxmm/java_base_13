package com.lenmon.base.day02.section2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 分步声明
//		数据类型 数组名称[] = null;(声明)
//		数组名称=new 数据类型[长度];(实例化数组)
		String[] names = null;// 不确定
		// 访问一个不确定的引用类型数据时（属性，方法），就汇报空指针异常
		//System.out.println(names[1]);// java.lang.NullPointerException 空指针异常
		names = new String[65];// 实例化数组
		System.out.println(names[1]);// null String类型的默认值为null
		
		// 静态声明数组：
		String[] stuName = {"shadow","happy"};
		System.out.println(stuName[0]);
	}

}
