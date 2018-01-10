import java.lang.*;

public class Arrays {
	
	///////QUESTION 1///////
	public static double arrySum(int[] arry) {
		double sum = 0;
		for (int i=0; i<arry.length; i++) {
			sum += arry[i];
		}
		return sum/arry.length;
	}
	///////QUESTION 2/////////
	public static String reverseString(String str) {
		String str1="";
		char[] arry = new char[str.length()];
		for (int i = 0; i<arry.length; i++) {
			arry[i]=str.charAt(i);
		}
		for (int j = arry.length-1; i>=0; i--) {
			str1 += arry[j];
		}	
		return str1;	
	}
	
	///////Question 3///////
	public static void longestString(String[] arry) {
		String longest="";
		int index;
		
		
		
	}
	
	
	///////////////TEST MAIN/////////////////////
	
	public static void main(String[] args) {
		////Q1//////
		/*
		int[] arry  = new int[6];
		for (int  i =0; i<arry.length; i++) {
			System.out.print("Enter Num: ");
			int x = IO.readInt();
			arry[i] = x;
		}
		double res = arrySum(arry);
		IO.outputDoubleAnswer(res);
		
		*/
		////Q2////
		/*
		String str = "hello";
		IO.outputStringAnswer(str);
		*/
		String s = "asdfasdf";
		String s1 = "asdff";
		System.out.println(s.compareTo(s1));
		
	}
}
