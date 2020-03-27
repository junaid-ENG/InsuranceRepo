package Int;

public class Stringmani {

	public static void main(String[] args) {

		String Wafa = "My Husband is Handsome";
		
		System.out.println(Wafa.length()); // complete length in numbers
		
		System.out.println(Wafa.charAt(5));// charAt(5) means 5 number pe jo character hai woh ajayga
		
		System.out.println(Wafa.indexOf("s"));//1st occurence of s
		
		System.out.println(Wafa.indexOf("s", (Wafa.indexOf("s")+1))); //2nd occurence of s
		
		
		System.out.println(Wafa.indexOf("s", Wafa.indexOf("s", (Wafa.indexOf("s")+1))+1));//3rd occurence
	
		System.out.println(Wafa.indexOf("YOur")); //if its not in a string then it will print -1
		
		//Trim method
		//remove before space and after space
		String a = "     Hello World   ";
		
		System.out.println(a.trim());
		
		//for between space we use replace()
		//old characet is space " " and new character is "" 
	
		
		

		
		
	}

}
