package com.Collections.programs;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "sara");
		m.put(3, "zeina");
		m.put(2, "ali");
		m.put(5, "jad");
		m.put(6, "jaud");
	


		
		System.out.println("iterating hash map");//output {1=sara, 2=ali, 3=zeina, 5=jad} : asecending order

		for (Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+ " = "+map.getValue());
		}
		
		
		m.putIfAbsent(6, "jadoo");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m2:m.entrySet()){    
	           System.out.println(m2.getKey()+" "+m2.getValue());    
	          }  
	}

}
