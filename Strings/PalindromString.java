package Strings.com;

public class PalindromString {
/*
 Palindrome String
 Input:"madam"
 Output:Palindrome
 */
	public static void main(String[] args) {
		
		String str="madam";
		int i,j,flag=0;
		for(i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("No Palindrome");
				break;
			}
			else {
				flag++;
			}
		}
		if(flag==str.length()/2) {
			System.out.println("Palindrome");
		}
		

	}
/*Time Complexity
	O(n)
	Efficient.*/
}
