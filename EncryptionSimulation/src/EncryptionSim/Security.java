package EncryptionSim;

import java.io.*;
import java.util.Scanner;

public class Security {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		Password pw = new Password();
		TextFile txt = new TextFile();
		
		
		System.out.println("Create a new password:");
		pw.create(sc);
		pw.encryption();
		
		int menuOption = menu(sc);
	
		while(menuOption!= 0) {
			// 1. creates  a password
			// 2. checks if it meets requirements
			// 3. then encrypts it
			if(menuOption == 1) {
				boolean check = false;
				System.out.println("Enter your old password to continue:");
				check = pw.match(sc.next());
				if(check==true) {
					System.out.println("Enter your new password:");
					pw.create(sc);
					pw.encryption();
				}
				check=false;
				menuOption = menu(sc);
				}
		
			// 1. creates file name Sentence.txt
			// 2. asks user to fill the file
			// 3. then encrypts the file
			if(menuOption == 2) {
				boolean check = false;
				System.out.println("Enter your password to continue:");
				check = pw.match(sc.next());
				if(check==true) {
					txt.create();
					System.out.println("Fill the text file:");
					sc.nextLine();
					txt.setFillData(sc.nextLine());
					txt.fill(txt.getFillData());
					txt.encryption();
					
				}
				check=false;
				menuOption = menu(sc);
			}
			
			// 1. decrypts file
			// 2. displays the file
			if(menuOption == 3) {
				
				boolean check = false;
				System.out.println("Enter your password to continue:");
				check = pw.match(sc.next());
				if(check==true) {
					txt.decryption();
					txt.display();
					txt.encryption();
				}
				check=false;
				menuOption = menu(sc);
			}
			
			//quit option to end the program
			if(menuOption == 4) {
				menuOption = 0;
			}
		}
		sc.close();
	}
	
	public static int menu(Scanner sc) {
		int option = 0;
		
		System.out.println("1. Create New Password");
		System.out.println("2. Create Text File");
		System.out.println("3. Display Text File");
		System.out.println("4. Quit");

		option = sc.nextInt();
		if(option<1||3<option)
			option = 0;
		return option;
	}
}
