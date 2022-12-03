package com.Strings.method;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "java developer";
		//otput = repoleved avaj
		String reverse = "";
	    int n =s.length();
	    
	   
	    for (int i = n-1 ; i>=0;i--) {
	    	char a = s.charAt(i);
	    	reverse +=a;
	    }
		
	    System.out.println("the reverse string is :"+reverse);
	}

}
