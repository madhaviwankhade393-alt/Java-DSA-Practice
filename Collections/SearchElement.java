package Collection.com;

import java.util.ArrayList;

public class SearchElement {
	/*
	Search Element in ArrayList
    Find:7 exists or not
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(4);
		al.add(9);
		al.add(2);
		al.add(8);
		int flag=0;
		for(Integer num:al) {
			if(num==7) {
				System.out.println("7 Exist");
				flag=1;
				break;
			}
		}
		if(flag==0)
	     System.out.println("7 is not Exist");	
		
//		************************************************
		
		if(al.contains(7))	
			System.out.println("7 Exist");
		else
			 System.out.println("7 is not Exist");	
		
		
		
		
		
	}

}
