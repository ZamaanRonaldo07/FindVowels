package vowles;

import java.util.HashSet;

public class UniqueChar {
	
	public static void main(String[]args) {
		
		String name = "Zamaan";
		
		HashSet<String> unique = new HashSet<String>();
	
		unique.add(name);
		
		unique.add("Zafar");
		
		unique.add("Zamaan");
		
		System.out.println(unique);
		
		
	}

}
