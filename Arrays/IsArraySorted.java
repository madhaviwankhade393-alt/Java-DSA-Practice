package Array.com;

public class IsArraySorted {
/* 7. Check if Array is Sorted
    Input:[1, 2, 3, 4, 5]
    Output:Sorted
 */
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
		
		int i,flag1=0,flag2=0;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				flag1++;
			}		
			else {
				flag2++;
			}
		}
        if(flag1==arr.length-1||flag2==arr.length-1) {
        	System.out.println("Array is sorted:");
        }
        else {
        	System.out.println("Array is not sorted");
        }
	}
 
}
