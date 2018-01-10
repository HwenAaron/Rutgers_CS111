
public class Meth {
	
	public static String toUpperCase(String str) {
		String result = "";
		return result;
	}
	public static void palindrone(String str) {
		String temp="";
		for(int i = 0; i<str.length()/2; i++) {
			int k = str.length()-1-i;
			char c1 = str.charAt(i);
			char c2 = str.charAt(k);
			if (c2 != c1) {
				System.out.println(false);
			}
		}
		System.out.println(true);
	}
	public static boolean compareString(String str, String str1) {
		if(str1.length()!=str.length()) {
			return false;
		}
		for(int i = 0 ; i<str.length(); i++) {
			if (str.charAt(i)!=str1.charAt(i)) {
				return false; 
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter String: ");
		String str1 = IO.readString();
		System.out.print("Enter String: ");
		String str2 = IO.readString();
		
		boolean bool = compareString(str1 , str2);
		System.out.println(bool);
		
		palindrone("bad");
	}
}
