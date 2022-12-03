package packag.car;

public class Test5 {

	public static void main(String[] args) {
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
		
		if (a instanceof M) {
			
			M m1 = (M)a;
			m1.run();
			
		}
	}

}
