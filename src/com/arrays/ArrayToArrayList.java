package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
	    int [] arr = {34,63,76,354,245,65,77};
	    
	  
	   
	    System.out.println("converting array to arraylist: "+convToarraylist(arr));
	    List <Integer> lt = convToarraylist(arr);
	    System.out.println("converting arraylist to array: "+Arrays.toString(convToarray(lt)));

	}
	
	
	
	//converting array to arraylist
	public static List<Integer> convToarraylist(int [] array){
		
		 List<Integer> ls = new ArrayList<Integer>();
		    
		    for(int a:array) {
		    	ls.add(a);
		    }
		    
		
		return ls;
		
	}
	
	
	//converting arraylist to array
		public static Object[] convToarray( List<Integer> ar){
		 Object[] arr = ar.toArray();    

			
			return arr;
			
		}
	

}
