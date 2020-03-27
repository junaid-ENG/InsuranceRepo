package Int;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		//1-Duplicate Element Array
		 String names[] = {"Java", "JavaScript", "Phyton","C", "Java"};
		                   //0         1          2      3      4    
	  	 //Compare each element  ---- WORST APPROACH because if you have 1000 
		 //                           of data to match with eachther it takes 0(NxN) time
		 
		 for (int i=0; i<names.length; i++) {
			 for(int j=i+1; j<names.length; j++ ) {
				 if (names[i].equals(names[j])) {
					 System.out.println("duplicate elements is::"+ names[i]);
				 }
				 System.out.println("****************");
			 }
		 }
		 
		 ///2-Using HashSet its a part of Java Collection:it stores unique value --> 0(n) <-- time complexity 
		 //set object will not add duplicate values
		 
		 Set<String> store = new HashSet <String>();
		 	 for(String name : names) { //names[] array ko String Name se initiate karida
			 if(store.add(name)== false ) {   //Store.add means one by one values store hongi
				                              //jaise hi same value dobara store karega to == false aur name print kardega
				 System.out.println("Duplicate  element it ::"  +  name);
			 }
			 System.out.println("****************");
	    //3-Using HashMaps
	    //Duplciate values are allow
	    // it stores keys and value
			
			 
			Map<String, Integer> hm= new HashMap<String, Integer>();
			
				for(String shame : names ) {
				Integer count= hm.get(shame);
				if(count == null) {
					hm.put(shame, 1);
				}
				else {
				hm.put(shame, ++count);
				}
				Set<Entry<String, Integer>> Entry =	hm.entrySet();
				for(Entry<String, Integer> entrySet : Entry) {
					if (entrySet.getValue()>1) {
						System.out.println("The duplicate value is ::" + entrySet.getKey());
					}
					
				
				}
		 
			 
			 
		 }
			 
		 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 }
		
		
		
		

