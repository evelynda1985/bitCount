package com.prg.classes;

import java.io.*;

public class ReadFile {
	
    public String fileName = "C:\\temp\\text.txt"; 
      
    public ReadFile() {	}

	public String readTxtFile() {
		String line = null;
    	StringBuilder textToString = new StringBuilder();
    	
	    try {
	    	
	        FileReader fileReader = new FileReader(fileName);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	        while((line = bufferedReader.readLine()) != null) {
	            textToString.append(line);
	            
	        }   
	        bufferedReader.close();         
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println("Unable to open file '" + fileName + "'");                
	    }
	    catch(IOException ex) {
	    	ex.printStackTrace();
	    }
	    
	    return textToString.toString();
    }

    //setters and getters
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}