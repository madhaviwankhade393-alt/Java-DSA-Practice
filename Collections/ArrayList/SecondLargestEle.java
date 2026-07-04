package Collection.com;

import java.util.ArrayList;

public class SecondLargestEle {
/*
 10. Second Largest Element
 [2,8,5,5,1]
 Output:5
  */
	public static void main(String[] args) {
		// Approach 1: Using sorting (O(n log n))
		// Works when duplicates are not a concern.

	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(2);
	al.add(8);
	al.add(5);
	al.add(1);
	al.sort(null); 
	
	System.out.println(al.get(al.size()-2));
//**********************************************
	// Approach 2: Without sorting (O(n))
	// Finds the second distinct largest element.
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	for(Integer num:al) {
		if(num>largest) { 
			secondLargest=largest;
			largest=num;
		}
		else if (num>secondLargest && num!=largest) {
			secondLargest=num;
			
		}
	}
	System.out.println(secondLargest);
	}


}

