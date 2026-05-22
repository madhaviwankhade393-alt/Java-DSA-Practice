package Array.com;

public class RotateArrayByKPositions {
/*
  11. Rotate Array by K Positions
   Input:[1, 2, 3, 4, 5]
          K = 2
   Output:[4, 5, 1, 2, 3]

 */
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
		int i,j,k=2,temp,size=arr.length;
		for(j=0;j<k;j++) {
		for(i=size-1;i>0;i--) {
			temp= arr[i-1] ;
			arr[i-1]= arr[i];
			arr[i]=temp;
		}	
		} 	
		for(i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}
