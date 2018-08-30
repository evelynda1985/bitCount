package com.prg.application;

import com.prg.classes.Bit;

public class App {

	public static void main(String[] args) {
		
		Bit bitObject1 = new Bit();
		
		//Receiving a character of list accomplish the requirement
		int size = 3;
		char[] arrayOfCharacters = {'a', 'i', 'j'};
		System.out.println("Array of characters");
		System.out.println("Number of high bits in the file are: " + bitObject1.bitCount(arrayOfCharacters));
		
		//Reading from a file with path "C:\\temp\\text.txt"
		System.out.println("\n");
		System.out.println("Reading from a file");
		System.out.println("Number of high bits in the file are: " + bitObject1.readFromFile());
		
		System.out.println(bitObject1.highBitCount('a'));
		
	}

}
