package Collection.com;

import java.util.ArrayList;

public class SortArrayList {
/*
 9️. Sort ArrayList Ascending
    [5,1,4]
    ↓
    [1,4,5]
  */
  public static void main(String[] args) {
		ArrayList<Integer> arl=new ArrayList<Integer>();
		// Add elements to first ArrayList
		arl.add(5);
		arl.add(1);
		arl.add(4);
		// Sort ArrayList using built-in sort() method

       arl.sort(null);
		System.out.println(arl); 
		
//*****************************************************************
		int i=0,j;
		ArrayList<Integer> al=new ArrayList<Integer>();
		// Add elements to second ArrayList
		al.add(5);
		al.add(1);
		al.add(4);
		// Sort ArrayList manually using nested loops
	   for(i=0;i<al.size()-1;i++) {
		   for(j=i+1;j<al.size();j++) {
		   
		if(al.get(i)>al.get(j)) {
			int temp=0;
			temp=al.get(j);
			// Swap elements using set() method
			al.set(j, al.get(i));
			al.set(i, temp);
				
		} 	
	}	
		
	}
	   
		System.out.println(al);
		
}
}
