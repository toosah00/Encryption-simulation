package EncryptionSim;

public class Password {
	private String password;
	
	public Password() {
		
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public boolean length() {
		boolean check = false;
		
		if(password.length()>=8) {
			check = true;
		}
		
		return check;
	}
	
	public boolean uppercase() {
		boolean check = false;
		
		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)>65&&90>password.charAt(i)) {
				check = true;
			}
		}
		
		return check;
	}
	
	public boolean lowercase() {
		boolean check = false;
		
		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)>97&&122>password.charAt(i)) {
				check = true;
			}
		}
		
		return check;
	}
	
	public boolean oneDigit() {
		boolean check = false;
		
		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)>48&&57>password.charAt(i)) {
				check = true;
			}
		}
		
		return check;
	}
	
	public boolean oneSymbol() {
		boolean check = false;
		int symbols[] = {33,35,36,37,38,40,41,42,43,45,47,61,62,63,64,91,92,93,94,123,125,126};
		
		for(int i =0;i<password.length();i++) {
			for(int j =0;j<symbols.length;j++) {
				if(password.charAt(i)==symbols[j]) {
					check = true;
				}
			}
		}
		
		return check;
	}
	
	public boolean noWhitespace() {
		boolean check = true;

		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)==32) {
				check = false;
			}
		}
		
		return check;
	}

	public boolean verify() {
		boolean check = false;

		if(this.length())
			if(this.uppercase())
				if(this.lowercase())
					if(this.oneDigit())
						if(this.oneSymbol())
							if(this.noWhitespace())
								check = true;
		
		return check;
	}
	
	// uses ascii values
	// adds one value to each char of the string
	public void encryption() {
		int asciiStr[] = new int[this.password.length()];
		
		for(int i =0;i<this.password.length();i++) {
			asciiStr[i] = (this.password.charAt(i)) + 1;
		}
		this.password = "";
		for(int i =0;i<asciiStr.length;i++) {
			this.password = this.password + (char)asciiStr[i];
		}
	}
	
}
