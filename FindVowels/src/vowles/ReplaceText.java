package vowles;

public class ReplaceText {
	
	public static void main (String[]args) {
 
		String add1 = "Ramapuram Chennai 600089";
		String add2 = "!@#$%^&U 123454656 Chennai";
		String add3 = "Ramapuram_Chennai 600089";
		String add4 = "RamapuramChennai600089";
		
		String addReplace1 = add1.replaceAll("[a-zA-Z]", "");
		
		String addReplace2 = add2.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		String addReplace3 = add3.replaceAll("[0-9]", "");
		
		String addReplace4 = add4.replaceAll("([a-zA-Z]+)(\\d+)", "$1 $2");		
		
		System.out.println(addReplace1);
		System.out.println(addReplace2);
		System.out.println(addReplace3);
		System.out.println(addReplace4);
		
		
}
}
