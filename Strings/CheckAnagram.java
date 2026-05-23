package Strings.com;

public class CheckAnagram {

	/*
	  Check Anagram
      Input:listen silent
	 */

	public static void main(String[] args) {
		String str="listen";
		String str1="silent";
		int i,j,k,count=0,count1=0,stop,flag=0;
		
		// Check lengths before frequency comparison
		if(str.length()==str1.length()) {
			
//	   Traverse each character of first string
		for(i=0;i<str.length();i++) {
			
	    	  stop=0;
	    	  count=0;count1=0;
	    	  
//	    	  Avoid recounting already checked characters
	    	  for(k=0;k<i;k++) {
	    		  if(str.charAt(i)==str.charAt(k) )
	    			  stop=1;
	    	      } 
		
	    	  
	    	  if(stop!=1) {
	     	     for(j=0;j<str.length();j++) { 
	     	    	 
//	     	    	 Count frequency in first string
	     		    if(str.charAt(i)==str.charAt(j) ) {
	     			   count++;
	     		     } 
	     	     }
	     		    
	     		    for(k=0;k<str1.length();k++) {
//	     		    	Count same character frequency in second string
	     		    if(str.charAt(i)==str1.charAt(k)) {
	     		    	count1++;
	     		    }
	     		    
	     		    }
	     	     }
	    	// Compare frequencies of both strings
	     		   if(count!=count1) {
//	     			   If mismatch found -> Not Anagram
	     			   flag=1;
	     			  System.out.println("No Anagram");
	     			   break; 	
	     	        }
	     		   
		}
		
//		If all frequencies match -> Anagram
			if(flag==0)
				System.out.println("It is a Anagram");
		   }
		
//		If length of both strings are not same
		else
			System.out.println("Never Anagram");
		
		
	    	  }
	
		}
		
	
	


