package Strings.com;

public class ReverseWordInString {

/*
 Reverse Words in Sentence 
 Input:"I love Java"
 Output:"Java love I"
 */

	public static void main(String[] args) {
		
		String str="I Love Java";
		 
         int i,j,k;
         for(i=str.length()-1;i>=0;i--)/*// Traverse string from end*/{
        	 k=i+1;
        	 if(i==0) /* Handle first word separately*/
        	 k=i;
        
        	 if(str.charAt(i)==' '|| i==0)   /*Detect word boundary using space*/ { 
        		 
        		 for(j=k;j<str.length() &&str.charAt(j)!=' '; j++)/*j loop prints one word at a time*/{
        			 
        			 System.out.print(str.charAt(j));/*Print characters of current word*/
        		   }
        		 System.out.print(" ");
        	
        	   }
        	 
       }
	
	}

}
