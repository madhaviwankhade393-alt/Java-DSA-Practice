package Array.com;

public class FindMissingNo {
/*
 12. Find Missing Number
 Input:[1, 2, 4, 5]
 Output:3
 */

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 4, 5};
        int i,miss=0;
        for(i=0;i<arr.length-1;i++) {
        	if(arr[i+1]-arr[i]!=1) {
        		miss=arr[i]+1; 
        	}
        	
        }
		
        System.out.println(miss+" is missing");
	}

}
