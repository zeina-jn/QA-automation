package com.arrays;

public class Reverse_Sentence {

	public static void main(String[] args) {

		String s = "Java Is Very Easy Language";
		
		String s1 [] = s.split(" ");
		String s2 = "";
	    int d =s1.length;

		
	    StringBuilder sb = new StringBuilder();


	    
	    for (String s3:s1) {
	    sb.append(" ");
	    sb.append(reverseString(s3));
	    }
	
	System.out.println("reverse of "+"("+s+")"+ " is "+sb.toString());


	}
	
	public static StringBuilder reverseString (String s) {
	    StringBuilder m = new StringBuilder(s);

	  
		
//		String rev = "";
//	    int n =s.length();
	    
	   
//	    for (int i = n-1 ; i>=0;i--) {
//	    	char a = s.charAt(i);
//	    	rev +=a;
//	    }
		return m.reverse();
	}

}