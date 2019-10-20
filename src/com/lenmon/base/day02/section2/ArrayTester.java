package com.lenmon.base.day02.section2;

public class ArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 保存三个班的人的昵称到一个二维数组
		String[] names11 = new String[70];
		String[] names12 = new String[65];
		String[] names13 = new String[66];
		String[][] names = new String[3][];
		// 第一个3：三行；第二个：n列，这里因为列数不定，所以可以不填
		names[0] = names11;
		names[1] = names12;
		names[2] = names13;
		
		// 静态声明二维数组：
		String[][] names_2 = {
				{"tom1","tom2","tom3"},
				{"jack1","jack2","jack3"},
				{"amy1","amy2","amy3"}
		};
		// 第二行第三个名称
		System.out.println(names_2[1][2]);
	}

}
