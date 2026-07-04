package Collection.com;

import java.util.ArrayList;

public class MaximumElement {
/*
 2️. Find Maximum Element
    Input:[4, 7, 1, 9]
    Output:9 
 */
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		// Add elements into ArrayList
		al.add(4);
		al.add(7);
		al.add(1);
		al.add(9);
		// Assume first element as maximum
		int i=0,max=al.get(i);
		System.out.println(al); 
		 for(i=0;i<3;i++) {
			// Traverse remaining elements
			if(al.get(i+1)> max) 
			// Update max if larger element is found
			   max=al.get(i+1);
			}
		// Print maximum element
		System.out.println( "maximum number is : "+max);
	}
		 
}
