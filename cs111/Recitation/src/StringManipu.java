
public class StringManipu {
	public static String longestRep(String str) {
		int currentLength = 1;
		int longestStart = 0;
		int currentStart = 0;
		int longestLength = 1;
		
		for(int i = 1; i< str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				currentLength++;
				if (currentLength > longestStart) {
					longestLength = currentLength;
					longestStart = currentStart;
				}
			}else {
				currentStart = i;
				currentLength = 1; 
			}
		}
		String result = str.substring(longestStart, longestLength);
		return result; 
		
	}
	public static void main(String[] args) {
		String test = longestRep(IO.readString());
		System.out.println(test);
	}
}
