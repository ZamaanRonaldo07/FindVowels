package vowles;

public class AddNumber {
	
	public static void main(String[]args) {
		
        int[] numbers =  {1, 2, 4, 6, 8, 9, 11, 12};
		
		int answer = 13;	
		
		for(int i=0; i<numbers.length;i++) {
			//System.out.println("first for loop " +i);
			for(int j=i;j<numbers.length;j++) {
			//	System.out.println("Second for loop " +j);
				if (numbers[i]+numbers[j]==answer) {
					System.out.println(numbers[i] +" + "+ numbers[j] +" = "+answer);
					
				}
			 
		 }
		
	}

}
}
	
