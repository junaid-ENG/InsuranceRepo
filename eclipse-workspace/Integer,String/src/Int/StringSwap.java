package Int;

public class StringSwap {

	public static void main(String[] args) {
//
      String a = "Hello";
      String b = "World";
//		 
//1-Append a and b
      a= a+b; //helloworld
	  System.out.println(a);
//		 
//		 //2-Store initial string a in string b	
//		 //0 se start karo,a ki length hai helloworld - b ki length hai world.
         // b= hello
      b=a.substring(0,a.length()-b.length());
      System.out.println(b);
//		 
//		 //3-Store initial string b in string 		  
	 a=a.substring(b.length());
	 System.out.println(a);
	 		
	}    
//	 
//	    String c="Hello";
//	    String d="world";
//	    String e="";
//	    
//	    e= c; // hello
//	    c= d; //world
//	    d=e;
//	    
//	   
//	    
//	    System.out.println("The value of c is "+c);
//	    System.out.println("The value of d is "+d);
//
//	    
//	    
	    
}

