package com.Techrious;

import com.BasicJavaPrograms.Car;

public class Benz extends Car {

	public static void main(String[] args) {
		Benz b = new Benz();
		b.Starts(); //we can call protected outside the package in subclass
	}

}
