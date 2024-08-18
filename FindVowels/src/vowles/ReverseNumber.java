package vowles;

public class ReverseNumber {
	
	public static void main(String[]args) {
		
		int number = 7885870;
		
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		
		System.out.println(sb);
		sb.reverse();
		System.out.println("Reversed number is : "+sb.toString());
		
	}

}
