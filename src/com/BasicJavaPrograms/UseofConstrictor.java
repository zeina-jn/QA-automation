package com.BasicJavaPrograms;

public class UseofConstrictor {
	
	//non static variable
	String name ;
	int age ;
	double sal;
	String gender;
	
	
	// use of contractor to initialise non static variable
	//keyword this - used to refer to non static variable
	public  UseofConstrictor (String name,int age,double sal,String gender) {
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.gender = gender;
		
	}
	
	public void display () {
		System.out.println("[ Name :"+name+" - Age :"+age+" - sal :"+sal+" - gender :"+gender+"]");
	}

	public static void main(String[] args) {
		UseofConstrictor cons = new UseofConstrictor("zeina", 40, 1000, "female");
		cons.display();
	}

}
