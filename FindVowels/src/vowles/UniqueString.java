package vowles;

public class UniqueString {
	
	public static void main(String[]args) {
	
		String givenChar = "aabbcddeef";
	System.err.println("Unique character is :");	
		
	for(int i=0; i<givenChar.length(); i++) {
		char currentchar = givenChar.charAt(i); //a
		boolean isUnique = true;
		//System.out.println("Iteration :" +currentchar);
		for(int j=0; j<givenChar.length(); j++) {
			if(i!=j && currentchar==givenChar.charAt(j)) {
				//a not equals to a and a==a
				isUnique = false;
				//System.out.println("Iteration second for loop:" +currentchar);
				break;
				
			}
			
		}
		if(isUnique) {
			System.out.print(currentchar);
		}
	}
	
		
	}
	}