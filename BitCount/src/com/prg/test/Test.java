package com.prg.test;

import static org.junit.jupiter.api.Assertions.*;

import com.prg.classes.Bit;
import com.prg.classes.ReadFile;

class Test {
	
	Bit bitObject1 = new Bit();
	ReadFile file = new ReadFile();
	int size = 3;
	char[] arrayOfCharacters = {'a', 'i', 'j'};
	
	//TDD
	//Step 1: Create test cases without any code
	
	//Step 2: Make this app run
	
	//Step 3: refactor de code
	
	//Test Case 1: Count high bit form a character
	@org.junit.jupiter.api.Test
	void testHighBitCount() {
		assertEquals(3, bitObject1.highBitCount('a'));
	}
	
	//Test Case 2: 
	//Count of number of high bits from a character of bits
	@org.junit.jupiter.api.Test
	void testBitCount() {
		assertEquals(11, bitObject1.bitCount(arrayOfCharacters));
	}
	
	//Test Case 3:
	//return a string from a file
	@org.junit.jupiter.api.Test
	void testReadFile() {
		assertEquals("hello worldGood night everybody", file.readTxtFile());
	}
	
	//Test Case 4:
	//count all of the high bits from a .txt file
	@org.junit.jupiter.api.Test
	void testReadFromFile() {
		assertEquals(126, bitObject1.readFromFile());
	}

}
