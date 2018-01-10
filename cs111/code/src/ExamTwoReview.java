import java.util.Arrays;

public class ExamTwoReview {
	
	public static String LongestSubString(String str) {
		int longestCount = 0; 
		int currentCount = 0; 
		char longestChar = 0;
		
		
		for(int i = 1; i< str.length(); i++) {
			
			if( str.charAt(i) == str.charAt(i-1) ) {
				
				currentCount ++; 
				
				if( currentCount > longestCount) {
					 longestCount = currentCount; 
				     longestChar = str.charAt(i); 
				}
				
			}
			
			else {
				
				currentCount = 0; 
			}
			
			
		}
				
		
		
		return (longestCount+1) + "" + longestChar; 
	}
	public static String mostLetter(String[] arr) {
		int currentLength = 0; 
		int longestLength= 0;
		int LongestIndex = -1; 
		
		for(int i = 0; i < arr.length; i++) {
			
			for( int j = 0; j < arr[i].length(); j++) {
				if(Character.isLetter(arr[i].charAt(j))) {
				currentLength++;
				}
			}		
			if(currentLength > longestLength) {	
				longestLength = currentLength; 
				LongestIndex = i; 
			}
			currentLength = 0;  
		}		
		return arr[LongestIndex]; 
	}
		
	public static void main(String[] args) {
		// 1
		
		System.out.print("Enter String: ");
		String s = IO.readString();
		IO.outputStringAnswer(LongestSubString(s));
		
		//2
		String[] arry = {"aasdf","asdfwef","asd","a","wedc"};
		IO.outputStringAnswer(mostLetter(arry));
		
		
	}
}