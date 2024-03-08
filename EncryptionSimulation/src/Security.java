package EncryptionSim;

import java.io.*;
import java.util.Scanner;

public class Security {
	public static void main(String args[]) throws IOException {
		// objects
		Scanner sc = new Scanner(System.in);
		Password pw = new Password();
		TextFile txt = new TextFile();
		
		// choice of menu option
		int menuOption = menu(sc);
		
		// different options according to menu choice
		
		// break loop if incorrect menu choice
		if(menuOption == 0) {
			
		}
		
		// 1. creates  a password
		// 2. checks if it meets requirements
		// 3. then encrypts it
		if(menuOption == 1) {
			// 1 and 2
			pw = pwCreate(pw,sc);
			// 3 
			pw.encryption();
		}
		
		// 1. asks user name of file an creates it
		// 2. asks user to fill the file
		// 3. then encrypts the file
		if(menuOption == 2) {
			// 1
			System.out.println("Name of text file:");
			txt.setName(sc.next());
			txt.create(txt.getName());
			
			// 2
			System.out.println("Fill the text file:");
			txt.setFillData(sc.next());
			txt.fill(txt.getFillData());
			
			// 3
			txt.encryption();
			}
		
		// 1. decrypts file
		// 2. displays the file
		if(menuOption == 3) {
			// 2
			txt.display();
		}
		
		sc.close();
	}
	
	public static int menu(Scanner sc) {
		int option = 0;
		
		System.out.println("Menu");
		System.out.println("1. Password Creation");
		System.out.println("2. Text File Creation");
		System.out.println("3. Display Text File");
		
		option = sc.nextInt();
		
		if(option<1||3<option)
			option = 0;
		
		return option;
	}
	
	public static Password pwCreate(Password pass,Scanner sc) {
		
		// asks user for password and sets it in pw object
		System.out.println("Enter a Password:");
		pass.setPassword(sc.next());
		
		// verifys the pw
		boolean valid = pass.verify();
		
		// if not valid, asks user to enter again until valid
		while(valid==false) {
			System.out.println("Enter a VALID Password");
			pass.setPassword(sc.next());
			valid = pass.verify();
		}
		if(valid==true)
			System.out.println("Password is VALID");
		
		//returns correct this Password pass Object
		return pass;
	}
}
