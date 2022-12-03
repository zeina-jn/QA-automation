package com.Techrious.session12;

public class Audi extends Car {
	
	public void music_car () {
		System.out.println("music car");
	}
	
	public void start() {
		System.out.println("audi starts");
	}

	public static void main(String[] args) {
		Car a = new Audi();//upcasting
		a.start();//return audi start
		a.stop();
		((Audi) a).music_car();
	}

}
