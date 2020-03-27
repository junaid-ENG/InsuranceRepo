package Int;

public class TestPractice {

	public static void main(String[] args) {

		
		
		String name = "Hello World ";
		     int len=  name.length();
		String rev ="";
		
		
		for (int i=len-1; i>=0 ; i --) {
			rev= rev   +      name.charAt(i);
		}
		
		
		
		System.out.println("The reverse string is :::"  + rev);
		
		
		String name1= "Hello World";
		System.out.println(new StringBuffer(String.valueOf(name1)).reverse());
		
		int a = 12345;
		int Rev = 0;
		
		
		while (a != 0) {
			Rev = Rev * 10 + a % 10;
			a= a /10 ;
		System.out.println("The reverse int is ::::"   + Rev);
			
		
		}
		int b = 12345;

		System.out.println(new StringBuffer(String.valueOf(b)).reverse());

		
	
	}

}
