package com.BasicJavaPrograms;

public class SalaryTest2 extends SalaryTest1 {

	public void SalaryBonus() {
		int bonus = 23;
		int Total_salary = super.sal+bonus; //super.sal
		super.Salary();// to call the super class method
		System.out.println("Total_salary = "+Total_salary);
		
	}
	
	
	public static void main(String[] args) {
		SalaryTest2 t = new SalaryTest2();
		t.SalaryBonus();
	}

}
