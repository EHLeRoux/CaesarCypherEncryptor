// Author: Eduard Le Roux
package Algorithms;

public class caesarCypherEncryptor {
	
	/*
	 * This method takes in a string and a key of type int, it then proceeds 
	 * to shift the string characters up in the alphabet by the set key amount. 
	 * Sample input: ab, 2
	 * Sample output: cd
	 * The method also wraps around the alphabet for cases where the key shifts
	 * the character pass the last letter of the alphabet. 
	 * Sample input: ab, 26
	 * Sample output: ab
	 */
	
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
