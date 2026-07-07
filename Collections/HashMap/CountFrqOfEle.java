package hashMap.com;

import java.util.ArrayList;
import java.util.HashMap;

public class CountFrqOfEle {
/*
 1. Count Frequency of Elements
 Input: [1,2,2,3,1,2]
 Output:
 1 = 2
 2 = 3
 3 = 1 
 */
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();	
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
     HashMap<Integer,Integer> map=new HashMap<Integer,Integer> () ;
   System.out.println(al);
   
 // Store frequency of each element
    for(Integer num:al) {
    	 // If element already exists, increase its frequency
       	if(map.containsKey(num)) {
   
        map.put(num,map.get(num)+1);
    }
    else {
    	  // Otherwise insert element with frequency 1
    	 map.put(num,1);
    }
	} 
    
    System.out.println(map);
	}
}
