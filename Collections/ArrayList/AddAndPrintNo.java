package Collection.com;

import java.util.ArrayList; 

public class AddAndPrintNo {
/*
 ️1. Add and Print Elements
     Add 5 integers in ArrayList
     Print using loop
 */
	public static void main(String[] args) {
		
		// Create ArrayList to store integers
		 ArrayList <Integer> al = new ArrayList<Integer>();
		 int ele=1;
		 
		 while(ele<6) {
     	// Add numbers 1 to 5 into ArrayList
		 al.add(ele);
		 ele++;
		 }
		// Traverse ArrayList using enhanced for loop
	    for(Integer num:al ) 
	    	// Print each element
	    	System.out.println(num);	
	    	
	    
	}

}
