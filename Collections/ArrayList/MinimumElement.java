
package Collection.com;

import java.util.ArrayList;

public class MinimumElement {
/*
 3️. Find Minimum Element
Input:[8, 2, 6]
Output:2
 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(8);
		al.add(2);
		al.add(6);
		int i=0,min= al.get(i);
		System.out.println(al);
		for(i=0;i<2;i++) {
			if(al.get(i+1)<min) 
				min=al.get(i+1);
		}
		System.out.println("Minimum element:"+min);
		
	}

}
