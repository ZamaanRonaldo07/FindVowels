package vowles;

public class Palindrome {

	public static void main(String[]args) {
		
		String palindrome ="rotator";
		
		StringBuilder reve = new StringBuilder(palindrome);
		
		String reversedName = reve.reverse().toString();
		
		if(palindrome==reversedName) {
			System.out.println("Given word is palindrome :" +palindrome);
		} else {
			
			System.out.println("Given word is not palindrome :" +palindrome);
		}
	}
}
