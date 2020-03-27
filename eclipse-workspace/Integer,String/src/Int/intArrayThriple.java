package Int;

import java.util.Arrays;

public class intArrayThriple {

	public static boolean Hello(int[]a,int sum) {

		Arrays.sort(a);
		   int len=  a.length;
		   
		   for(int i=0; i<len; i++) {
			   int start = i+1;
			   int end = len-1;
			  while(start<end){
				 if(a[i] + a[start] + a[end] == sum) {
					  return true;
					  }else if(a[i] + a[start] + a[end] == sum) {
						  start++;
					  }else {
						  end--;
				
			  }
		   }
			   
		
		   }
		return false;
		  
	}
		  
public static void main (String[]args) {
	int a[]= {1,4,45,6,10,8};
	int sum = 15;
	
	boolean result= Hello(a,sum);
	if(result) {
		System.out.println("Exists");
	}else {
		System.out.println("NO EXIST");
}
	
}
}
 
