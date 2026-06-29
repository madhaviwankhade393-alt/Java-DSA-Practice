package Collection.com;

import java.util.ArrayList;

public class CountEvenOdd {
/*
 6️. Count Even and Odd Numbers
   Input:[1,2,3,4,5]
   Even = 2
   Odd = 3
  */
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	// Add elements to ArrayList
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	int evenCounts=0;
	// Count even numbers using enhanced for loop
	for(Integer num:al) {
		if(num %2==0) 
			evenCounts++;		 
	}
	// Odd count = Total elements - Even count
	int oddCounts=(al.size()-evenCounts);
	// Print even and odd counts
    System.out.println("Even :"+ evenCounts);
	System.out.println("Odd :"+oddCounts);
	}
 
}
