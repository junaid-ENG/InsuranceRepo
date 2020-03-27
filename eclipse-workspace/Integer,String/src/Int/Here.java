package Int;


public class Here {

	public static void main(String[] args) {
 
	//3 steps for string swap
String a ="Hello";
String b ="world";
		

a=a+b;

b=a.substring(0, a.length()-b.length());

a=a.substring(b.length());


System.out.println("the value of a is :::"+ a);
System.out.println("the value of b is :::"+ b);







	}
}
		