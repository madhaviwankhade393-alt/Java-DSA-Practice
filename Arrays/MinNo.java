package Array.com;
//2. Find Minimum Element in Array
//Input:[8, 2, 5, 1, 9]
//Output:1
public class MinNo {

	public static void main(String[] args) {
		int arr[]= {8, 2, 5, 1, 9};
		int i=0;
		int min=arr[i];
		
		for(i=0;i<arr.length-1;i++) {
			if(min>arr[i+1])
			{
				min=arr[i+1];
				
			}			
			
		}
		
		System.out.println("Minimum Element in Array:"+min);

	}
 
}
