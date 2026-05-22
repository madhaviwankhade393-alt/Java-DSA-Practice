package Array.com;

/* 4. Find Second Largest Element in the Array
      Input:[10, 20, 4, 45, 99]
      Output:45
 */
public class SecondLargest {
	
//1st logic--> bubble sort
	public static void main(String[] args) {
		int arr[]= {10, 20, 4, 45, 99};
		int i,j,temp;
		for(i=0;i<arr.length-1;i++) {
			
		for(j=0;j<arr.length-1;j++) {
				
			if(arr[j]>arr[j+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
		}
		}
		System.out.println("Second Largest element:"+ arr[arr.length-2]);
//********************************************************************************

//		2nd Logic--> largest and second largest
	
		i=0;
		int max=arr[i],max1=max;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];		
				
			}
		}
			System.out.println("Largest element:");	
			
			
			for(i=0;i<arr.length;i++) {
				if(arr[i]>max1 && arr[i]!=max) {
				 max1=arr[i];	
				}  
			}
			System.out.println("Second Largest element:"+ max1);	
			
			
			
//************************************************************************************	
			
		}		
		
	}

 
