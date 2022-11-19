package package1;

public class String5 {

	public static void main(String[] args) {
		String s = "java developer";
        int n = s.length();
        String s1="";
		
        for (int i =0;i<n;i++) {
		char a = s.charAt(i);
		
		if (s1.indexOf(a)==-1) {			
			System.out.println(a+" : "+Get_count_char.getCount(s,a));
			s1 = s1+a;
		}
		}
	}

}
