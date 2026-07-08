package hashMap.com;
import java.util.ArrayList;
import java.util.HashMap;
public class CommonElement {
/*
 7.Find Common Elements
   Input:
   [1,2,3,4]
   [3,4,5,6]
   Output:
   [3,4] 
  */
	public static void main(String[] args) {
ArrayList<Integer> firstList=new ArrayList<Integer>(); 
		
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);  
        firstList.add(4);
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		// Store first list elements for O(1) lookup
		for(Integer num:firstList) {
			map.put(num, true);
		}
		
		ArrayList<Integer> secondList=new ArrayList<Integer>(); 
		ArrayList<Integer> commonList=new ArrayList<Integer>();  
		
		secondList.add(3);
		secondList.add(4); 
		secondList.add(5); 
		secondList.add(6);
		// Check common elements from second list
		 for(Integer num: secondList) {
			 if(map.containsKey(num)) {
				  commonList.add(num);
			 }
			  
		 }	
		 System.out.println(commonList);
	} 
}
