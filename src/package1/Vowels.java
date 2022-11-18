package package1;

public class Vowels {

	public static void main(String[] args) {
		String s = "java developer";
		
		// output  -- get the vowels
        int n = s.length();
        String s1="";
        String comma = ",";
		
        for (int i =0;i<n;i++) {
		char a = s.charAt(i);
		
         if (a == 'e' ||a == 'o'|| a == 'a'|| a == 'u'|| a == 'i' ) 	{
        		if (s1.indexOf(a)==-1) {
        		
        	     s1+=a+" ";
        		}
         }
		
        }
		System.out.println("vowels are :"+s1);

	}

}
