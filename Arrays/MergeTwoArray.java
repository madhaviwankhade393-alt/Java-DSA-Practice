package Array.com;

public class MergeTwoArray {
/*
15. Merge Two Sorted Arrays
 Input:[1,3,5] [2,4,6] 
 Output:[1,2,3,4,5,6]
 */
	
	public static void main(String[] args) {
		
		int arr1[]= {1,3,5};
		int arr2[]= {2,4,6};
		
	    int  mergedArr[]={0,0,0,0,0,0};
		int i=0,j=0,l,size=arr1.length+arr2.length;
		
		for(l=0;l< size;l++) {
			
			if(arr1[i]<arr2[j] && i!=3) {
				
				if(i<arr1.length-1 )
				mergedArr[l]=arr1[i];
				i++; 
			}
			else {
				mergedArr[l]=arr2[j];
				if(j<arr2.length-1)
				j++;
			
			} 
		}
	    
	    for(i=0;i< mergedArr.length;i++) {
	    	System.out.println(mergedArr[i]); 
	    }
	    
	}

}
