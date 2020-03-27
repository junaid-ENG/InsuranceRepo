package Int;

import java.util.HashSet;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {

	 String a  = "##$#@$@$@#HELLO WORLD@#$#@%@#$@#";
	
	a= a.replaceAll("[^a-zA-Z0-9]", "");
	 
	 System.out.println(a);
	
	}
}
