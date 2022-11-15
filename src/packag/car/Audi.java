package packag.car;

public class Audi extends Car {
	
	public void starts() {
		System.out.println("audi car starts successfully");
	}
	
	public void music_system() {
		System.out.println("audi car starts successfully");
	}

	public static void main(String[] args) {
		Car a = new Audi(); //upcasting in java : storing subclass object into super class variable
		a.starts();
		a.brake();
		//downcasting
		if ( a instanceof Audi) 
		{
			Audi a1 = (Audi)a;
			a1.music_system();
		}
	}
}


//output 
//audi car starts successfully
//car brakes successfully
//audi car starts successfully
