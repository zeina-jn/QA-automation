package com.Strings.method;

public class Get_count_char {

	public static void main(String[] args) {
		String s = "java developer";
				
	     System.out.println("count is :"+getCount(s,'a'));

	}
	
	public static int getCount(String s , char c ) {
		
		
		return s.length()-s.replace(c+"", "").length();// return 2

		
	}
	

	

}
