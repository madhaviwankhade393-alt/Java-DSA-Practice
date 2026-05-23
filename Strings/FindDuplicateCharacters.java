package Strings.com;

public class FindDuplicateCharacters {

	/*
	  Find Duplicate Characters
      Input:"programming"
      Output:r g m
	 */
	public static void main(String[] args) {
		
		String str="programming";
		int i,j,stop,k;
		for(i=0;i<str.length();i++) {
			stop=0;
		 	for(k=0;k<i;k++) {
				if(str.charAt(k)==str.charAt(i)) {
					stop=1;
				}
			}
			for(j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && stop!=1) {
					System.out.print(str.charAt(i)+" ");
					break;
				}
				
			}
		}
		
		

	}

}
