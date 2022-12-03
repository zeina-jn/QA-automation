package com.BasicJavaPrograms;

public class Blocks {
	
	//blocks in java
	//1.static block
	//2.non static block
	
	static int a ;
	int b;
	
	static {
	a =545;
		System.out.println("static block 1 "+ a);// return a = 545
	}
	
	static {
		a =55;

		System.out.println("static block 2 "+a);// return a = 55
	}
	
    static {
	System.out.println("static block 3 "+a);// return a = 55
     }

    
    //non static block
	
    { b =90;
    	System.out.println("non static block 1");
    }
    
    {b=80;
    	System.out.println("non static block 2 "+b);
    }


	public static void main(String[] args) {
     System.out.println("main starts");
     Blocks bb = new Blocks();
//     Blocks b1 = new Blocks();
//     System.out.println(bb.b);

     System.out.println("main ends");

	}

}
// output
//static block 1 545
//static block 2 55
//static block 3 5
//main starts
//main ends



//output with non static
//static block 1 545
//static block 2 55
//static block 3 55
//main starts
//non static block 1
//main ends




// 2 object for non static
//static block 1 545
//static block 2 55
//static block 3 55
//main starts
//non static block 1
//non static block 2
//non static block 1
//non static block 2
//main ends