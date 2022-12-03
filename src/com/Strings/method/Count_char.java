package com.Strings.method;

public class Count_char {

	public static void main(String[] args) {
		String s = "java developer";
		int c = 0 ;
		
		for (int i =0 ; i <s.length();i++) {
			char a = s.charAt(i);
			
			if (a == 'e') {
				c++;
			}
		}
		
		System.out.println("count of 'e' : "+c);


	}

}
