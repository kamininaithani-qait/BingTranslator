package org.TestNG.app.BingTranslator.Keywords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadWriteTest {

	public static void main(String args[]) throws UnsupportedEncodingException{
	FileInputStream fis = null;
	FileOutputStream fos =null; 
    BufferedReader br = null;
    BufferedWriter bw = null;
    String line;
    
    try {
    	fos = new FileOutputStream(new File("d:\\file1.txt"));
    	line = br.readLine();
    	bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF8"));
		if(line != null) {
    		bw.write(line);
    		System.out.println("done!! string ="+line);
    		bw.flush();
    		bw.close();
    	}
		else 
			System.out.println("file not contain text");
    	}  catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
 
    try {
        	fis = new FileInputStream(new File("d:\\file.txt"));
        	br = new BufferedReader(new InputStreamReader(fis, "UTF8"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
