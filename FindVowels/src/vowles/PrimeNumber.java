package vowles;

public class PrimeNumber {
	
	
	public static void main(String[]args) {
		
		int number = 42;
		int m =number/2;
		int flag=0;
		
		if(number==0 | number==1) {
			System.out.println("Its not a prime number :" +number);
		} else {
			for(int i=2;i<=m;i++) {
				if(number%i==0) {
					System.out.println("Its not a prime number : " +number);
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("its a prime number: "+number);
			}
		}
		
		
		
					
	}
}

