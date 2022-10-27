import java.util.Scanner;
class Condition2 {
    public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
   
   System.out.println("enter the number ");
   int a = sc.nextInt();
    System.out.println("enter the number2 ");
    int b = sc.nextInt();
if (a>b){
      System.out.println("a is bigger than b");
}else if (a<b){
          System.out.println("b is bigger than a");

}else{
              System.out.println("a is equal to b");

}




    }
}