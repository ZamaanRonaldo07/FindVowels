package vowles;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFunc {
	
	public static void main(String[]args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		//adding fruit list
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("jackfruit");
		
		System.out.println("List of fruits" +fruits);
		
		//modify jackfruit to avacado
		fruits.set(4, "Avacado");
		
		System.out.println("Modified list : "+fruits);
		
		//print fruit using index
		String fruitIndex= fruits.get(2);
		System.out.println("Printing fruit using index : "+fruitIndex);
		
		//Iterate fruit names and print all fruit name
		
		for(String fruit : fruits) {
			
			System.out.println("Fruit : "+fruit);
			
		}
		//Get total size of the fruits
		int size = fruits.size();
		System.out.println("Total size is "+size);
		
		
		//remove one fruit
		fruits.remove(1);
		System.out.println("After removing fruit list" +fruits);
		
		//print the "Avacado" fruit
		boolean list = fruits.contains("Avacado");
		System.out.println("Is the fruit name apple is printed ? :" +list);
		
		
		//removeAll fruits
		fruits.removeAll(fruits);
		
		System.out.println("Fruits remvoed :"+fruits);
		
		
		
	}

}
