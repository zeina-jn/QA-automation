package com.Collections.programs;

public class ThreadInterface implements Runnable {

	public static void main(String[] args) {
		ThreadInterface t = new ThreadInterface();

		Thread t1 = new Thread(t);
	    t1.start();
	    for(char c = 'A'; c <= 'z'; c++)
	    {
	        System.out.println("c interface="+c);
	    }
	    
		
	}

	@Override
	public void run() {
		for(int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
        }		
	}

}
