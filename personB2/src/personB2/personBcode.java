import java.util.scanner //import
public class personBcode {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in); 
	    System.out.println("Type in your name. Now.");
	    String name = scan.nextLine();  //fixed spelling
	    String name2 = "";
	    for (int i = name.length() - 1; i >= 0; i-- ) { //add --
	    	name2 += name.charAt(i);
	    }
	    System.out.println("Username is: " + name2);  

	}
	
}
