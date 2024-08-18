package vowles;

import java.util.Arrays;

public class MissingCharacters {
	
	public static void main(String[]args) {
		
		
		String givenName = "abcdefghijklmnopstuvwxyz";
		String expectedName = "abcdefghijklmnopqrstuvwxyz";
		
	  char[] first = givenName.toCharArray();
	  char[] second = expectedName.toCharArray();
	  
	  if (Arrays.equals(first, second)) {
		System.out.println("Given characters not missing: "+ givenName +" and "+ expectedName);
	}
	  
	  for(int i=0; i<givenName.length();i++) {
		  
		  
	  }
	  
		
			}
	}

