package Array.com;

public class FindDuplicates {
/*
 10. Find Duplicate Element
     Input:[1, 3, 4, 2, 2]
     Output:2
 */
	public static void main(String[] args) {
		int arr[]= {1, 3, 4, 2, 2};
		int i,j,duplicate=0;
		for(i=0;i<arr.length-1;i++) {
			
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate=arr[i];
					break;
//					break avoids annecessary comparisons
					
				}
				
			}
		
		}
		System.out.println(duplicate);  
		
		
	}

}
