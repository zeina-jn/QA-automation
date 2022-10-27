import java.util.Scanner;
class Conditionnal1 {
    public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
   System.out.println("enter the number ");

   int a = sc.nextInt();
  
//   if (a%2==0){
//       System.out.println(a+" is a even number  ");

//   }
//   else {
//       System.out.println(a+" is not an even number ");

//   }


//  if (a%2==0 && a%5==0){
//       System.out.println(a+" is a even number and also diviiable by 5 ");

//   }
//   else {
//       System.out.println(a+" is not a even number and also diviiable by 5 ");

//   }



   if (a%2==0 || a%5==0){
      System.out.println(a+" is a even number or also diviiable by 5 ");

  }
  else {
      System.out.println(a+" is not a even number or  also not diviiable by 5");

  }

    }
}