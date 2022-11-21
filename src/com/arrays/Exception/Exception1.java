package com.arrays.Exception;

public class Exception1 {

	public static void main(String[] args) {

		int a = 33;
		int b = 0;
		try {
			System.out.println(a/b);

		}catch(ArithmeticException e) {
			System.out.println(a/2);
		}
		System.out.println("main ends");
		
		
	}

}
