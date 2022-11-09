package com.BasicJavaPrograms;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		do {
			System.out.println("eligible to vote .."+age);
			age--;
		}while(age>=18);
	}

}


//25
//24
//23
//22
//21
//30
//19
//18
