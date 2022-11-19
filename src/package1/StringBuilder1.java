package package1;

public class StringBuilder1 {

	public static void main(String[] args) {
		String s = "java developer";
		
		//StringBuilder sb = new StringBuilder("java developer");
		
		//sb.reverse();
		
		//System.out.println("reverse are :"+sb);

		
//		StringBuilder sb=new StringBuilder("Hello");  
//		sb.reverse();  
//		System.out.println(sb);//prints olleH  
		
       System.out.println("the reverse string is :"+reverseString(s));//prints olleH  

		
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		int n = s.length();
        for (int i = n-1;i>=0;i--) {
        	sb.append(s.charAt(i));
        }
		
		return sb.toString();
		
	}

}
