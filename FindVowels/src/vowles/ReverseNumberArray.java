package vowles;

public class ReverseNumberArray {
	
	public static void main(String[]args) {
	
	int[] number = {1,2,3,4,5,6,7,8,9};

	
	for(int i=1; i<=number.length;i++) {
		
		int reverseNumber = number[number.length-i];
		System.out.print(reverseNumber);
	}
	
}
}