package EncryptionSim;

import java.io.*;
import java.util.Scanner;

public class TextFile {
	private String name;
	private String fillData;
	
	public TextFile() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFillData() {
		return fillData;
	}

	public void setFillData(String fillData) {
		this.fillData = fillData;
	}

	public void create(String name) throws IOException {
		File file = new File(this.name + ".txt");
		System.out.println(file.getAbsolutePath());
	}

	public void fill(String fillData) throws IOException {
		FileOutputStream file = new FileOutputStream(this.name+ ".txt");
		PrintWriter outFile = new PrintWriter(file);
		
		outFile.println(this.fillData);
		
		outFile.close();
		file.close();
	}
	
	public void display() throws IOException {
		FileInputStream inStream = new FileInputStream(this.name + ".txt");
		Scanner file = new Scanner(inStream);
		String data;

		while(file.hasNext())
		{
			data=file.nextLine();
			System.out.println(data);
		}
		
		file.close();
		inStream.close();
	}
	
	public void encryption() throws IOException {
		//opens this file name
		FileInputStream inStream = new FileInputStream(this.name + ".txt");
		Scanner scannerIn = new Scanner(inStream);
		
		while(scannerIn.hasNext())
		{
			this.fillData=scannerIn.nextLine();
		}
		
		//encryption of fill data
		int asciiStr[] = new int[this.fillData.length()];
		
		for(int i =0;i<this.fillData.length();i++) {
			asciiStr[i] = (this.fillData.charAt(i)) + 1;
		}
		this.fillData = "";
		for(int i =0;i<asciiStr.length;i++) {
			this.fillData = this.fillData + (char)asciiStr[i];
		}
		
		//closes
		scannerIn.close();
		inStream.close();
		
		//opens this file name
		FileOutputStream outStream = new FileOutputStream(this.name+ ".txt");
		PrintWriter printWriterOut = new PrintWriter(outStream);
		
		printWriterOut.println(this.fillData);
		
		printWriterOut.close();
		outStream.close();
		
	}
}
