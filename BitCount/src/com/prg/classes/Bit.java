package com.prg.classes;

public class Bit{
	
	public ReadFile file = new ReadFile();
	
	public Bit() {}
	
	//Read information from a file.
	public int readFromFile() {
		String texIntoString = file.readTxtFile();
		
		char[] characters = texIntoString.toCharArray();
	
		return bitCount(characters);
	}
	
	//count the bits of a array of characters
	public int bitCount(char[] characters) {	
		int counter = 0;
		
		for(char theChar : characters) {			
			counter += highBitCount(theChar);
		}		
		return counter;
		
	}
	
	//Count high bits.
	public int highBitCount(char a) {
		int counter = 0;
		String charInBits = Integer.toBinaryString(a);
		
		for(char theBit : charInBits.toCharArray()) {
			if(theBit == '1') {
				counter++;
			}
		}
		
		return counter;
	}

	public ReadFile getFile() {
		return file;
	}

	public void setFile(ReadFile file) {
		this.file = file;
	}
	
	
	

}
