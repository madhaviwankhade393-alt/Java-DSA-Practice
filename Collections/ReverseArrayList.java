package Collection.com;

import java.util.ArrayList;

public class ReverseArrayList {
/*
 7️.Reverse ArrayList
  [1,2,3]
  ↓
  [3,2,1]
 */
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		// Add elements to ArrayList
		al.add(1);
		al.add(2);
		al.add(3);
		// Reverse list using built-in reversed() method
		System.out.println("Reversed ArrayList :"+al.reversed());
		// Print reversed list
		
		
	//	************************************************************
		
		int i=0;
		ArrayList<Integer> rev=new ArrayList<Integer>();
		// Reverse ArrayList using loop
		for(i=al.size()-1;i>=0;i--) {	
		// Create a new ArrayList and add elements from last to first
			rev.add(al.get(i));	
		}
		System.out.println("Reversed ArrayList :"+rev);
		
	}

}
