package Strings.com;

public class FirstNonRepteatedChar {

	/*
	  Find First Non-Repeating Character
      Input:"aabbcde"
      Output:c
	 */
	
//	1st logic
	public static void main(String[] args) {
      String  str="aabbcde";
      int i,j,k,stop,flag=0;
     
      for(i=0;i<str.length();i++) {
    	  
    	    stop=0;
    	  for(k=0;k<i;k++) {
    		  if(str.charAt(i)==str.charAt(k))
    			  stop=1;
    	      }
    		if(stop==0) {
    	       for(j=i+1;j<str.length();j++) {
    	     
                	if(str.charAt(i)==str.charAt(j)) 
    	    		    break;
    	           	
    	          	else {
    	    	      	flag=j;
    	          	}
    	      	}   	
    	     } 
    		if(flag==str.length()-1) {
      		  System.out.println(str.charAt(i)+" is First Non-Repeating Character");
      		  break;
    		}
    	  
      }
      
//  ************************************************************************************    
//      2nd Logic
      int a,b,count;
      for(a=0;a<str.length();a++) {
    	  count=0;
    	  stop=0;
    	  for(k=0;k<a;k++) {
    		  if(str.charAt(a)==str.charAt(k))
    			  stop=1;
    	      } 
    	  if(stop!=1) {
    	   for(b=0;b<str.length();b++) {
    		   if(str.charAt(a)==str.charAt(b) ) {
    			   count++;
    		   }
    	   }
    	  }
    	   if(count==1) {
    		   System.out.println("2nd Logic");
    		   System.out.println(str.charAt(a)+" =is First Non-Repeating Character" );
    		   break;
      }
           
	}
      
	}
}
