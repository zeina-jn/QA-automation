package com.BasicJavaPrograms;
public class ConstructorOver {

	//constrauctor overloading
	ConstructorOver (){
		System.out.println("default conatructor");
	}
	

	ConstructorOver (int a ){
		System.out.println("constructor with int param a = "+a);
	}
	
	ConstructorOver (String n ,int a ){
		System.out.println("name = "+n+" and "+"age ="+a);
	}
	
	
	public static void main(String[] args) {
		ConstructorOver c = new ConstructorOver();
		ConstructorOver c1 = new ConstructorOver(22);
		ConstructorOver c2 = new ConstructorOver("sami",24);


	}

}
