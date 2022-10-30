import java.util.Scanner;
class MethodOverload {


public static int addition (int a , int b) {

return a+b;

}

public static int addition (int a ) {

return a;

}
public static double addition (double a , double b) {

return a+b;

}

public static String addition (String a , String b) {

return a+" and "+b;

}
 public static void main (String [] args) {

    System.out.println(addition(55,10));
    System.out.println(addition(33.4,22.1));
    System.out.println(addition(5,10));
    System.out.println(addition(5));
    System.out.println(addition("zeina","sara"));







    }
}