package hashMap.com;

import java.util.HashMap;

public class CountFrqOfChar {
/*
 2. Count Frequency of Characters
    Input: "programming"
    Output:
    p = 1
    r = 2
    o = 1
    g = 2
    a = 1
    m = 2
    i = 1
    n = 1 
 */
	public static void main(String[] args) {
		int i=0;
     String str="programming";
    HashMap<Character ,Integer> map= new HashMap<Character,Integer>();
   // Store frequency of each character
     for(i=0;i<str.length();i++) { 
    	// If charactyer already exists, increase its frequency
    	if(map.containsKey(str.charAt(i))) {	
    		map.put(str.charAt(i) , map.get(str.charAt(i))+1);	 
    	}
    	else {
    		// Otherwise insert element with frequency 1
    		map.put(str.charAt(i), 1);
    	} 
     }
     System.out.println(map);
	}
}
