package com.Collections.programs;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorclass {

	public static void main(String[] args) {
      Vector v = new Vector();
      v.add(1234);
      v.add("salem");
      v.add("joe");
	  System.out.println("elements : "+v);

	  System.out.println("Enumeration : ");

      Enumeration e = v.elements();
      while(e.hasMoreElements()) {
    	  System.out.println(e.nextElement());
      }
      
	  System.out.println("for each :");
for (Object obj:v) {
	  System.out.println(obj);

}
      
	}

}
