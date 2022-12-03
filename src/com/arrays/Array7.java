package com.arrays;

public class Array7 {

	public static void main(String[] args) {
	    int [] array = {3,5,8,12,16,18,23,39,43,49,53,64,77};
	    
	//  int a =   binarySearchele(array,5);
	 // System.out.println(binarySearchele(array,3));
	  System.out.println(binarySearchele(array,5));
	 // System.out.println(binarySearchele(array,8));
//	  System.out.println(binarySearchele(array,12));
	//  System.out.println(binarySearchele(array,16));
//	  System.out.println(binarySearchele(array,18));
//	  System.out.println(binarySearchele(array,23));
//	  System.out.println(binarySearchele(array,64));



	}
	
	public static int binarySearchele (int[] ar,int ele) {
		
		int f =0 ;
	//	int n = arr.length;
		int l =ar.length-1;
		
		while(f<=l) {
			int m = (f+l)/2;  //6
		System.out.println("array m1 "+m);


			if (ar[m]== ele) {
				// System.out.println("array m er "+arr[3]);
				return m;}
			else if (ar[m]>ele) {
				l = m-1;
			// System.out.println("array last "+l);
				 
		   }else if (ar[m]<ele) {
			f = m+1;}
		
		}
		return -1;
		
	}

}

