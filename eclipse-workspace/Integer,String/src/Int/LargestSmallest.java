package Int;

import java.util.Arrays;

public class LargestSmallest {
	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,-5};
		int largest = numbers[0];
	    int	smallest = numbers[0];
	    
	    
	    for(int i=1; i<numbers.length; i++) {
	      if (numbers[i]>largest){
	    	  largest= numbers[i];
	      }
	      else if (numbers[i]> smallest){
	    	  smallest= numbers[i];
	      }
		
	}

		System.out.println("the array of int ::"+ Arrays.toString(numbers));
		System.out.println("the largest number is::"+ largest);
		System.out.println("the smallest number is::"+ smallest);
}
}