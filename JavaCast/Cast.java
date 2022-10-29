class Cast {
    public static void main (String [] args) {
  
    
  //int a = 34.6;  error: incompatible types: possible lossy conversion from double to int

  //Widening Casting (automatically) - converting a smaller type to a larger type size
  //double a = 3456; return 3456.0  
    //order  : byte / short / char / int / long / float / double
  
  //int a = (int)34.56; //narrowing casting (bigger to smaller)
 // Narrowing Casting (manually) - converting a larger type to a smaller size type
 //double -> float -> long -> int -> char -> short -> byte


  // int a =(String)"zeina"; //return Asc
  //  System.out.println("a = "+a);





//Convert a String to an Integer

  // String str = "25";
  //       try{
  //           int number = Integer.parseInt(str);
  //           System.out.println(number); // output = 25
  //       }
  //       catch (NumberFormatException ex){
  //           ex.printStackTrace();
  //       }



   String str = "25";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}