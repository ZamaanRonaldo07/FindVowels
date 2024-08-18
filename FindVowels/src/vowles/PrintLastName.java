package vowles;

public class PrintLastName {

	public static void main(String[]args) {
		
		String name = "Mohammed Zamaan Subhan";
		
		String[] nameParts = name.split(" ");
		
		 String firstName = nameParts[0];
		 String middleName = nameParts[1];
		 String lastName = nameParts[nameParts.length-1];
		 System.out.println(firstName);
		 System.out.println(middleName);
		 System.out.println(lastName);
	}
}
