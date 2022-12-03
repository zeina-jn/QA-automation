package com.BasicJavaPrograms;

public class Hiding2 extends Hiding1 {
	//method hiding in java
	
	public static void m1() {
		String file_name = "text.txt";
		System.out.println("m1 hiding  class");
	}
	
	public static void m2() {
		String file_name2 = "text2.txt";
		System.out.println("m2 hiding  class");
	}
	
	public static void m3() {
		String file_name3 = "text3.txt";
		System.out.println("m3 hiding  class");
	}


}
