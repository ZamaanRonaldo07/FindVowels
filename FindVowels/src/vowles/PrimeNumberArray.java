package vowles;

public class PrimeNumberArray {

	public static void main(String[]args) {
		
		 int[] number = {1,2,3,4,5,6,7,8};
		 
		for (int num :number) {
			if(isPrime(num)) {
				System.out.println("Its prime number :" +num);
			}
		}
	
}

public static boolean isPrime(int number) {
	
	if(number<=1) {
		return false;
		
	}
	for(int i=2; i<=Math.sqrt(number);i++ ) {
		
		if( number%i==0) {
		return false;	
		}
	}
	return true;
	
}
	
}
