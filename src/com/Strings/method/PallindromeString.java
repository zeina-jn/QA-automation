package package1;

public class PallindromeString {

	public static void main(String[] args) {
       String s = "Madam";
       boolean status = ispallindrom(s);
       if (status) {
   		System.out.println("string "+s+" is a pallindrom");

       }else {
      		System.out.println("string "+s+" is not a pallindrom");
       }
	}
	

	public static boolean ispallindrom(String s) {
		
		s = s.toLowerCase();
		for (int i = 0 ; i< s.length()/2;i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) {
			
				return false;
			}
		}
		return true;
		
	}

}
