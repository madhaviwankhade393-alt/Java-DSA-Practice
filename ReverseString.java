package Strings.com;

public class ReverseString {

/*
  1. Reverse a String
     Input:"hello"
     Output:"olleh"
 */
	public static void main(String[] args) {	
		String str="hello";	
		int i;
//		System.out.println(str.charAt(4)+""+ str.charAt(3)+""+str.charAt(2)+""+str.charAt(1)+""+str.charAt(0));
		for(i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	} 
}
