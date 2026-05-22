package Array.com;

/*3.Reverse an Array
 Input:[1, 2, 3, 4, 5] 
 Output:[5, 4, 3, 2, 1] */

public class ReverseArray {

//	1st logic 
	
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
    int i,n=1,j,swap=0;

    for(j=0;j<arr.length-1;j++)
    {
    for(i=0;i<arr.length-n;i++) {
    	swap=arr[i];
    	arr[i]=arr[i+1];
    	arr[i+1]=swap;
    }
    n++;
    }
    
    for(i=0;i<arr.length;i++) {
    System.out.println(arr[i]);
    }
//   Time Complexity=O(n²)
    
// **************************************************************************   
    
//    2nd Logic 
    int arr1[]= {1, 2, 3, 4, 5};
    int mid,low=0,high=arr1.length+1;
    swap=0;
    mid=(low+high)/2;
    high=arr1.length-1;
    
    for(low=0;low<mid-1;low++,high--) {
    	swap=arr1[low];
    	arr1[low]=arr1[high];
    	arr1[high]=swap;		
    }   
    System.out.println();
    for(i=0;i<arr.length;i++) {
        System.out.println(arr1[i]); 
        }
	} 

}
