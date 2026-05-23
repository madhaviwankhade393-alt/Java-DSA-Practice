package Strings.com;

public class LowerToUpper {
 
/*
 Convert Lowercase to Uppercase
 Without using built-in methods  	
 */
	public static void main(String[] args) {
		String str="madhavi";
		int i,s='m';	
	  for(i=0;i<str.length();i++) {
		  s=str.charAt(i); 
		  s=s-32;
	      char c=(char) s;
		  System.out.print(c);
		  
		 }
	}
}