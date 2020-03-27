package Int;

import java.util.Arrays;

public class SumOfArray {

	public static void main (String[]args) {
		
		int name[]= {3,-1,-7,-4,-5,9,10};
		
		for(int i=0; i<name.length;i++) {
			int firstNumber= name[i];
			for(int j=i+1; j<name.length; j++) {
				int secondnumber= name[j];
				for(int k=j+1; k<name.length;k++) {
					int thirdnumber= name[k];
					
		int sum = firstNumber +secondnumber+thirdnumber ;
		if(sum==0) {
			System.out.println(firstNumber+","+secondnumber+","+thirdnumber);
		}
					
					
				}
			}
		}
	}
}
	  
