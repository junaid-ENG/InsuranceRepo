package Int;

public class Wallmart {

	public static void main(String[] args) {
		
		int a [] = {3,-1,-7,-4,-5,5,9,10};
		
		for(int i=0;i<a.length;i++) {
			int firstnumber= a[i];
			for(int j=i+1; j<a.length; j++) {
				int secondnumber= a[j];
				for(int k=j+1; k<a.length;k++) {
					int thirdnumber=a[k];
			int sum = firstnumber + secondnumber + thirdnumber ;
			if(sum==15) {
				System.out.println(firstnumber+","+secondnumber+","+thirdnumber);
			}
			
				}
			}
		}
	
		
		
	}
		}
		
			