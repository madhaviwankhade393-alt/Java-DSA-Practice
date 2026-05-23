package Strings.com;

public class RemoveSpace {

/*
  Remove Spaces from String
  Input:"java is fun"
  Output:"javaisfun"
 */
	
	public static void main(String[] args) {
		String s1, str="java is fun";
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				System.out.print(str.charAt(i)); 
			}
		}
		
		
	}
	
}
