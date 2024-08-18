package vowles;

import java.text.NumberFormat;

public class AddComma {
	
	public static void main(String[]args) {
		
		int number = 1234567890;
		
		NumberFormat numformat = NumberFormat.getInstance();
		System.out.println(numformat);
		
		String num =numformat.format(number);
				System.out.println("Number formatted: " +num);
	
	}

}
