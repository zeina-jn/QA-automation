package com.arrays;

public class Array5 {

	public static void main(String[] args) {
	    int [] array = {2,6,7,3,8,22,44,12,55,33};
	    sortArray(array);
	    
	    for (int a:array) {
	    	System.out.println(a);

	    }

	}
	
	
	public static void sortArray(int[]arr) {
		
		int n = arr.length;
		for (int i=0;i<n;i++) {
			
			for (int j=i+1;j<n;j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
	}

}
