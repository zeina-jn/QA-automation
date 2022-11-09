package com.BasicJavaPrograms;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			int number = sc.nextInt();
			
	        System.out.println("Multiplication Table of " + number);

			
			for (int i = 0 ; i <=10 ; i ++) {
				System.out.println(i+" x "+number+" = "+(i*number));
			}
		}
			
			
//			int num;
//	        
//	        System.out.print("Enter any positive integer: ");
//	        num = sc.nextInt();
//	                
//	        System.out.println("Multiplication Table of " + num);
//	        
//	        for(int i=1; i<=10; i++)
//	        {
//	            System.out.println(num +" x " + i + " = " + (num*i) );
//	        }

	}

}
