package vowles;

public class ReverseString {
	
	public static void main(String[]args) {
		
		String name ="Zamaan";
		
		
	
	StringBuilder sb = new StringBuilder(name) ;
	System.out.println(sb.reverse().toString());
	System.out.println(sb.delete(0, 2));
		
	}

}
