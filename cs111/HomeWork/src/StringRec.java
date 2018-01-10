
public class StringRec {
	
	public static void main(String arg[]) {
		System.out.println(decompress("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT"));
	}
	
	public static String decompress(String compressedText) {
	    if (compressedText.length() <= 1) {
	    	return compressedText;
	    }

	    int a = 1;
	    while (a < compressedText.length() && compressedText.charAt(0) == compressedText.charAt(a)) {
	        a++;
	    }

	    String lengthString = a > 1 ? String.valueOf(a) : "";
	    return lengthString + compressedText.substring(0,1) + decompress(compressedText.substring(a));
	}

}
/