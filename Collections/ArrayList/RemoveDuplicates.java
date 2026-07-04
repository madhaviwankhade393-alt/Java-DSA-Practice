package Collection.com;

import java.util.ArrayList;

public class RemoveDuplicates {
/*
 8️. Remove Duplicate Elements
[1,2,2,3,1]
↓
[1,2,3]
  */
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(1);
		int i,j;
     for(i=0;i<al.size()-1;i++) {
    	 
    	 for(j=i+1;j<al.size();j++) {
    		// Compare values using equals() and remove duplicates
    		 if(al.get(i).equals(al.get(j))) {
    			// Remove duplicate elements using nested loops
    			 al.remove(j); 
    			 j--;
    		 } 
    	 }  
     }
    System.out.println(al);

	}

}
