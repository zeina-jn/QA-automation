import java.util.Scanner;
class Addition {


public static String add (int a , int b) {
int sum = a + b ;
return "the sum of "+a+ " and "+b + " is "+sum;

}
 public static void main (String [] args) {
 Scanner sc = new Scanner (System.in); 
 System.out.println ("Enter 1st number");
 int a = sc.nextInt();
 System.out.println ("Enter 2nd number");
 int b = sc.nextInt();
    String s = add(a,b);
    System.out.println(s);



    }
}