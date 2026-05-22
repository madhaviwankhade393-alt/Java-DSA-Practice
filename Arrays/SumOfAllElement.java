package Array.com;

public class SumOfAllElement {
/*6. Sum of All Element
Input:[1, 2, 3, 4]
Output:10 
*/
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4};
		int i,sum=0;
		for(i=0;i<arr.length;i++) {
		sum=sum+arr[i];	
	
		}
		System.out.println("Sum of All Element="+sum);
		
	}

}
