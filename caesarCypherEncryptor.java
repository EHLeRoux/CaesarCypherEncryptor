// Author: Eduard Le Roux
package Algorithms;

public class caesarCypherEncryptor {
	
	public static String caesarCypherEncryptorF (String str, int key) { 
		StringBuilder newString = new StringBuilder();
		for (int i = 0 ; i < str.length(); i ++) { 
			int newCharInt = (int) str.charAt(i) + key;
			while (newCharInt > 122) { 
				newCharInt = newCharInt - (26); 
			} 
			newString.append((char) newCharInt);
		}
		
		return newString.toString();
	}
	
	public static void main (String[] args) { 
		
		System.out.println(caesarCypherEncryptorF("abc", 57));
		
	}

}
