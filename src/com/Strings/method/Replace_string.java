package com.Strings.method;

public class Replace_string {

	public static void main(String[] args) {
		String myString = "java developer";
		//output jv developer 12
		

   //  String D = myString.replaceAll("a", "");
   //  System.out.println("count is :"+getCount(myString,"a"));
		
	     System.out.println("count is :"+getCount(myString,'a'));

	}
	
	public static int getCount(String s , char c ) {
		
		
		return s.length()-s.replace(c+"", "").length();// return 2

		// return s.length()-s.replaceAll(c, "").length();// return 2
		
	}
	
	

}
