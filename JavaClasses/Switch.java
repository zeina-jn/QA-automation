import java.util.Scanner;
class Switch {
    public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
   System.out.println("enter month number ");

   int a = sc.nextInt();

   switch (a) {
    case 1: 
    case 11:
    case 12:
       System.out.println("winter season ");
       break;

    case 4: 
    case 5:
    case 6:
       System.out.println("summer season ");
       break;
    
    case 7: 
    case 8:
    case 9:
       System.out.println("rainy season ");
       break;


   }
    }
}