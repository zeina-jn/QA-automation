public class NarrowingCasting {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println("myDouble "+myDouble);   // Outputs 9.78
    System.out.println("myInt "+myInt);      // Outputs 9
  }
}