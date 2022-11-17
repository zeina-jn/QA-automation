package package1;

public class Distinct {

	public static void main(String[] args) {
		String s = "java developer";
        //output = jav devlopr;
		
		String s1 = "";
		
		
		int n = s.length();
		
		for (int i =0 ; i <=n-1;i++ ) {
			char a = s.charAt(i);
			
			if (s1.indexOf(a)==-1) {
				s1+=a;
			}
			
		}
		
		System.out.println("unique charaters : "+s1);
		
	}

}
