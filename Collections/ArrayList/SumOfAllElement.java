package Collection.com;

import java.util.ArrayList;

public class SumOfAllElement {
/*
 4️. Sum of All Elements
   Input:[1,2,3,4]
   Output:10
 */
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	// Add elements to ArrayList
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	
	int i=0,sum=0;
	// Calculate sum using index-based for loop
	for(i=0;i<al.size();i++) {
		sum+=al.get(i);
	}
	System.out.println(sum);
	
//	******************************************
	 sum=0;
	for(Integer num:al)
		sum+=num;
	System.out.println(sum);

	}

}
