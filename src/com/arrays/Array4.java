package com.arrays;

import java.util.Arrays;

public class Array4 {
	
	public static void main(String[] args) {
	    int [] array = {2,6,7,3,8,22,44,12,55,33,};
       // System.out.println(Arrays.sort(array)); 
	    Arrays.sort(array);// sort in ascending order
	    
	    for (int a:array) {
	    	System.out.println(a);
	    }
	}
}
