package com.BasicJavaPrograms;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner (System.in)) {
			//loop statement
			//while
			System.out.println("enter your age");
			int age = sc.nextInt();		
			while (age>=18){
				System.out.println("elligible to vote ..."+age);
				age--;
			}
		}
		
		
	}

}
