package com.Collections.programs;

public class Thread1 extends Thread {
	
	public void run()
    {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
        }
    }

	public static void main(String[] args) {
    Thread1 t = new Thread1();
    t.start();
    for(char c = 'A'; c <= 'z'; c++)
    {
        System.out.println("c="+c);
    }
    
	} 

}
