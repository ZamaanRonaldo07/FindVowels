package vowles;

import java.util.Arrays;

public class LowestAndLargestNumber {
	
	public static void main(String[]args) {
		
		int[] nums = {2,2,10,5,50,80,80};
		
//		for(int i : nums) {
//			
//			System.out.println("value taken as "+ i );
//		}
			Arrays.sort(nums);
			
//			for (int j : nums) {
//			System.out.println("order "+ j );
//			}
			
			int smallest = nums[0];
			int largest = nums[nums.length-1];	
			
			System.out.println("Smallest number is " + smallest);
			System.out.println("Largest number is " + largest);
		}
	
	}


