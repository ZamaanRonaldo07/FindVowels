package vowles;

public class SwapTwoNumbers {
	
	public static void main(String[]args) {
		
		int a =61;
		int b=101;
		
		
		System.out.println("Before swapping a is :"+a+ " and b is " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a is :"+a+ " and b is " +b);
	}

}
