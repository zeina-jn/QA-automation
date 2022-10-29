class StringMethod {
    public static void  main (String [] args){


//length method

String myName = "zeina";
System.out.println ("The length of the txt string is: "+ myName.length());

//to uppercase method

String username = "zeina";
System.out.println ("toUpperCase : "+ username.toUpperCase());


String firstname = "ZEINA";
System.out.println ("toLpperCase: "+ firstname.toLowerCase());


//Finding a Character in a String
//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

String txt = "Please locate where 'locate' occurs!";
System.out.println ("index of : "+ txt.indexOf("locate")); //return 7

  }
}