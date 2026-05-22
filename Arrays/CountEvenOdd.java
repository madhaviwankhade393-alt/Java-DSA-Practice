package Array.com;

public class CountEvenOdd {
/*5. Count Even and Odd Numbers
 Input:[1, 2, 3, 4, 5, 6]
 Output:Even = 3
        Odd = 3
 */
	
	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4, 5, 6};
        int i,even=0,odd=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}	
		}
		System.out.println("Even="+even+"\n"+"Odd="+odd);
		
	}

}
