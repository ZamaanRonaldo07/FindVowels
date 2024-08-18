package vowles;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String []args) {
		
		String str1 = "care";
		String str2 = "race";
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		System.out.println("Sorted array is : " +charArr1+ " " +charArr1);
		
		if (Arrays.equals(charArr1, charArr2) && str1.length() == str2.length() ) {
			
			String value1 = charArr1.toString();
			System.out.println(value1);
			System.out.println("Given string is anagram :"+str1+" and "+str2);
			
		} else {
			System.out.println("Given string is not anagram: "+str1+ " and "+str2);
		}
		
	}

}
