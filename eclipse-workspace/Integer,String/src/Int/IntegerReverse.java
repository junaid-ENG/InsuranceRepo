package Int;

public class IntegerReverse {

 public static void main(String[] args) {
     //1- Integer Reverse Method
		int a = 12345;  // This result we want 987654321
		int rev = 0;  //ek or string banainge with 0 value because is main store karainge
		
		while (a !=0 ) {   // 123456789 is not equals to 0 (CONDITION TRUE)
			  rev = rev * 10 + a % 10 ;  // % means remainder in LCM in maths= left over
			                           //            0 * 10 = 0 
			                           //  remainder is 5 so 0 + 5 = 5
			                           //           
		 	 a = a / 10; // 12345 / 10 = remainder will b 5 ..		
		 	System.out.println(rev);
		}
		
	//2 Using StrtingBuffer Method for Integer
	int a1 = 12345;
    System.out.println(new StringBuffer(String.valueOf(a1)).reverse());   
    
    
    
    //3 Using String Buffer Method for String
    String B = "Syed Junaid Ali Shah";
    System.out.println(new StringBuffer(String.valueOf(B)).reverse());
    
    
    

    //4String Reverse Method  
    String c = "Syed Junaid Ali Shah";
    int Len= c.length();
    String Rev = "";   //ek or string banainge with 0 value because is main store karainge
    
    for (int i=Len-1;  i>=0; i--) {
         Rev = Rev + c.charAt(i);
         System.out.println(Rev);
       
    }
	
	}
	
}