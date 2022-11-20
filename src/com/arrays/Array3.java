package com.arrays;

public class Array3 {

	public static void main(String[] args) {
    int [] array = {2,6,7,3,8,22,44,12,55,33,};
    //outpu -- return the biggest value
    int bigger = 0;
    
    for (int a:array) {
    	if (bigger<a) {
               bigger =a ;
    	}
    }
	System.out.println("the biggest value is :"+bigger);

    
	}

}
