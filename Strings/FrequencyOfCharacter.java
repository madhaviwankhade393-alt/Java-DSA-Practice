package Strings.com;

public class FrequencyOfCharacter {

	/*
	 Count Frequency of Character
      Input:"aabbccaaa"
      Output:a = 5
             b = 2
             c = 2
	 */
	public static void main(String[] args) {
		String str="aabbccaaa";
		
		int i,j,k,count,stop;
		for(i=0;i<str.length();i++) {
			count=0; 
			stop=0;
			
			for(k=0;k<i;k++) { /* Check previous characters
                                  Avoid recounting same character
                                   k loop checks previous positions */
				if(str.charAt(i)==str.charAt(k)) {
					stop=1;
//					 stop = 1 means character already processed
				}
			}	
			for(j=0;j<str.length();j++) { /* j loop counts total occurrences */
				if(str.charAt(i)==str.charAt(j) && stop!=1) {/*Compare current character with all characters*/
					count++;
					}
		          }
			if(stop!=1)
//			Print only first occurrence frequency
			System.out.println(str.charAt(i)+" ="+count);
			
			}		
		}
	
	}
	 	
		
	
	


