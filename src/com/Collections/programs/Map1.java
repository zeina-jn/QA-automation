package com.Collections.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Map1 {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "sara");
		m.put(3, "zeina");
		m.put(2, "ali");
		m.put(5, "jad");
		m.put(6, "jad");
	


		



		
		System.out.println(m);//output {1=sara, 2=ali, 3=zeina, 5=jad} : asecending order
		
		Set set = m.entrySet();
	   Iterator itr = set.iterator();
	   while (itr.hasNext()) {
		   Map.Entry m1 = (Map.Entry)itr.next();
		   
		   System.out.println(m1.getKey()+" = "+m1.getValue());
		   
	   }
		
		
	
	    
		

		
		
		
	}

}
