package Array.com;

public class TwoSumProblem {
/*
 13. Two Sum Problem
     Input:Array = [2, 7, 11, 15]  Target = 9
     Output:2 + 7
 */
	public static void main(String[] args) {
		int arr[]= {2, 7, 11, 15};	
        int i,j=0,Target=9,n1=0,n2=0;   
		for(i=0;i<arr.length-1;i++) {
			
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==9) { 
					n1=arr[i];
					n2= arr[j];
					break;
//			break--> if pair of two no. got..then close the loop to avoid unnecessary itteration
				 }
			}
		}    
        System.out.println(n1 + "+" + n2+ "=" + Target);
	}
}
 
