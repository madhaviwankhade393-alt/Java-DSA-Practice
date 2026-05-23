package Strings.com;

public class CountVowelConsonent {
/*
 Count Vowels and Consonants
 Input:"education"
 */
	public static void main(String[] args) {
		String str="education";
		int i,vowel=0,con=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
				vowel++;	
			else 
			con++;	
		}
         System.out.println("Vowels="+vowel);
         System.out.println("Consonants ="+con);
	}

}
