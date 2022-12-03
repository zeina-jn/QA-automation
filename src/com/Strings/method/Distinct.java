package com.Strings.method;

public class Distinct {

	public static void main(String[] args) {
		String s = "java developer";
        //output = jav delopr;
		
		String s1 = "";
		
		
		int n = s.length();
		
		for (int i =0 ; i <n;i++ ) {
			char a = s.charAt(i);
			
			if (s1.indexOf(a)==-1) {
				s1+=a;
			}
			
		}
		
		System.out.println("unique charaters : "+s1);
		
	}

}
