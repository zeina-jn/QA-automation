package com.BasicJavaPrograms;

public class Thisstatement {

	
	 Thisstatement(){
		System.out.println("default statement");
	}
	
	 Thisstatement(int a ){
		this();
		System.out.println("constructor with int args "+a);
	}
	 Thisstatement(String b){
	//	this(); // return default statement
		this(22); // return constructor with int args
		System.out.println("constructor with string args "+b);
	}
	
	public static void main(String[] args) {
		Thisstatement t = new Thisstatement("zeina");
	}

}

//output

//default statement
//constructor with int args 22
//constructor with string args zeina