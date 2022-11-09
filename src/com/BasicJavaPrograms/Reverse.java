package com.BasicJavaPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			int number;
			int reverse = 0;
			
			System.out.print("Enter the number ");
			number = console.nextInt();
			
			int temp = number;
			int remainder = 0;
			
			while(temp>0)
			{
			remainder = temp % 10;
			System.out.println("temp % " + remainder);

			reverse = reverse * 10 + remainder;
			    temp /= 10;
			}

			System.out.println("Reverse of " + number + " is " + reverse);
		}

	}

}
