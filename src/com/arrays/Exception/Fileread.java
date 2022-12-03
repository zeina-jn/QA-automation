package com.arrays.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fileread {

	public static void main(String[] args) {
try {
	FileReader f = new FileReader("c://textfile.txt");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
