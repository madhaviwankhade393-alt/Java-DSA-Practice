package Array.com;

public class MoveAllZeros {
/*9. Move All Zeros to End
    Input:[0, 1, 0, 3, 12]
    Output:[1, 3, 12, 0, 0]
 */

	public static void main(String[] args) {
		int arr[]= {0, 1, 0, 3, 12};		
		int i,j,temp=0;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				for(j=i;j<arr.length-1;j++) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
/*
Time Complexity
O(n²)
Because:nested loops use hue hain.
 */
}
