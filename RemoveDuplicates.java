package Array.com;

public class RemoveDuplicates {
/* 8. Remove Duplicates from Sorted Array 
      Input:[1, 1, 2, 2, 3, 4, 4]
      Output:[1, 2, 3, 4]
 */
	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 2, 3, 4, 4};
		int i,j,size=arr.length;  

		for(i=0;i<size-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				size--;
//			    Reduce logical size
//			    size--
//			    Because duplicate element is removed logically
				for(j=i+1;j<size-1;j++) {
				arr[j]=arr[j+1];
				}
				if(i>0)
				 i--;
//				Recheck same index
//			    i--
//			    After shifting, new element comes at same position
//			    Useful for cases like: [1,1,1,2]
	   }
		}
		for(i=0;i<size;i++)
//          Print only valid elements
//		    Use loop till 'size'
//		    Ignore extra elements at end	
		{
			System.out.println(arr[i]); 
		}
	}
}


 








