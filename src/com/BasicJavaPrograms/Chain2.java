package com.BasicJavaPrograms;

public class Chain2 extends Chain1 {
	//constructor chaining in java
	Chain2(){
		//implicit constructor chaining in java
		super();// call chain 1 without param
		System.out.println("chain2 constructor");
	}
	Chain2(int a ){
		//super with param : explicit constructor
		super(99); // call chain 1 with param
		System.out.println("chain2 constructor a ="+a);
	}

	public static void main(String[] args) {
	    // Chain1 c = new Chain1(12);

		Chain2 c2 = new Chain2(77);
	}

}
