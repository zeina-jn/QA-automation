package com.BasicJavaPrograms;

public class Audi extends Car {
	//overriding method : means changing the implementation of super class in sub class based on the requirement
	// overriding rules "
	//same param if there are any params
	//same method type 
	//same method name
	
	public void Starts() {
		System.out.println("audi car starts successfully");
	}

	public static void main(String[] args) {
		Audi a = new Audi();
		a.brake();
		a.Starts();
	}

}
