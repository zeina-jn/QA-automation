package com.Collections.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedList1 {

	public static void main(String[] args) {
       
		LinkedList lst = new LinkedList();
		lst.add("zeina");
		lst.add(12345);
		
		lst.add(1, "jad"); // insert jad after zeina
		lst.addLast("mimi");
		
		
//		Iterator itr = lst.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println("element in forward direction");
		ListIterator lt = lst.listIterator();
	
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		
		System.out.println("element in backward direction");	
		while (lt.hasPrevious()) {
            // lt.set("elenmet of list iterator"); //replace the first element
			//System.out.println(lt.previousIndex());

		System.out.println(lt.previous());
			lt.remove();
		}
		System.out.println(lst);

		
	}

}
